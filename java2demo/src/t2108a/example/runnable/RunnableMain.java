package t2108a.example.runnable;

public class RunnableMain {
    public static void main(String[] args) throws InstantiationException, InterruptedException {
        System.out.println("Main thread running...");

        //Thao mot thread tu interface Runnable
        Thread thread = new Thread(new RunnableDemo());
        thread.start();

        Thread.sleep(3000);
        System.out.println("Main thread stopped");
    }
}
