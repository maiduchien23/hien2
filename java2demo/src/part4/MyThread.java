package part4;

public class MyThread implements Runnable{
    String name;
    Thread t;

    MyThread(){
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 0; i > 0; i--){
                System.out.println(name + ": " +1);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(name +"Interrupted");
        }
        System.out.println(name + "exiting.");
    }
}

