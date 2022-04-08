package countDemo;

public class Counter {
    int value;
    // The forward-count method , that increatses the value from 0 to 9
    // print out the value in each steps (with 300ms delay)

    public void count(){
        value = 0;
        while (value < 10) {
            System.out.println("Conunt: " + (value++));
            pause(300);
        }
    }


    public void conutdown(){
        value = 10;
        while (value >= 0){
            System.out.println("Countdown:" + (value--));
            pause(200);
        }
    }

    private void pause(long time) {
        try {
            Thread.sleep(time);

        }catch (InterruptedException e){}
    }
}
