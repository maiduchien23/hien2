package t2108a.example.lab;

public class Race {
    public static void main(String args[]){
        //create an array of runnable RaceCar objects
        Racecar[] cars = new Racecar[5];
        cars[0] = new Racecar(10, "Mario");
        cars[1] = new Racecar(10, "Songoku");
        cars[2] = new Racecar(10, "Herman");
        cars[3] = new Racecar(10, "Doremon");
        cars[4] = new Racecar(10, "Hoang Phi Hong");
        //start racing
        for(int i=0; i<5; i++)
            cars[i].start();
    }

    private record RaceCar(int i, String mario) { }
}
