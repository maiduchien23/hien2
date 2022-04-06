package t2108a.example.thread;

public class DemoThread extends Thread{

    @Override
    public void run(){
        //super.run();

        int index = 1;
        for (int i = 0; i < 20 ; i++){
            System.out.println("DemoThread running " + index++);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
