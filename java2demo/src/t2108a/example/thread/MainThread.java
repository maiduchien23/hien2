package t2108a.example.thread;

public class MainThread {
    public static void main(String[] args) throws InstantiationException, InterruptedException {

        int index = 1;
        for (int i = 0; i < 5; i++){
            System.out.println("Main Thread running" + index++);
            Thread.sleep(2000);//sleep 2s
        }
        DemoThread demoThread = new DemoThread();
        demoThread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("Main Thread running" + index++);
            Thread.sleep(2000);
        }

        System.out.println("Main thread stopped");
    }
}
