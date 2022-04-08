package Wrapper;

public class oneThread extends Thread{

    public void run(){
        System.out.println("1");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }
        System.out.println("2");
    }
    public static void main(String [] args) throws InterruptedException {
        oneThread c1 = new oneThread();
        oneThread c2 = new oneThread();

        c1.start();
        c2.start();
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}
