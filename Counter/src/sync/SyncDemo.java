package sync;

class PrintDemo{
    public void printCount() throws InterruptedException{
        for (int i = 5; i > 0; i--){
            System.out.println("Count...");
        }
    }
}
 class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    PrintDemo printDemo;

    ThreadDemo(String threadName, PrintDemo printDemo){
        threadName = threadName;
        printDemo = printDemo;
    }

    @Override
    public void run(){
        synchronized (printDemo) {
            try {
                printDemo().printCount();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("Thread " + threadName + "exiting");

    }


    @Override
    public void start(){
        System.out.println("Starting " +threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        PrintDemo printDemo = new PrintDemo();

        ThreadDemo threadDemo1 = new ThreadDemo("Thread-1", PrintDemo);
        ThreadDemo threadDemo2 = new ThreadDemo("Thread-2", PrintDemo);

        threadDemo1.start();
        threadDemo2.start();
    }
}
