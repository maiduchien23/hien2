package thread;

public class Application {
    public static void main(String [] args) throws InterruptedException{

        MultithreadThread mThread = new MultithreadThread();
        mThread.start();

        MultithreadRunnable mRunnable = new MultithreadRunnable();
        Thread thread = new Thread(mRunnable);
        thread.start();

        TestThread test1 = new TestThread();
        System.out.println("Name of test:" +test1.getName());
        System.out.println("Id of test:" +test1.getId());
        test1.start();
        test1.join(1500);//Join vao luong main, main cho den khi luong test1 finish


        TestThread test2 =new TestThread();
        System.out.println("Name of test2:" +test2.getName());

        TestThread test3 =new TestThread();
        System.out.println("Name of test3:" +test3.getName());
        test2.start();
        test2.join();
        test3.start();
    }
}
