package part4;

public class MainThread {
    public static void main(String[] args){
        new MyThread();
        new MyThread();
        new MyThread();
        try {
            Thread.sleep(20000);
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
