package t2108a.example.runnable;

import static java.lang.Thread.*;

public class RunnableDemo implements Runnable{
    @Override
    public void run(){
        int index = 1;
        for (int i = 0; i < 5; i++){
            System.out.println("RunnableDemo Running " +index++);
            try{
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
