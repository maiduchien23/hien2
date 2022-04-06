package thread;

public class TestThread extends Thread{
    @Override
    public void run(){
        for (int i = 1;i < 5; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
