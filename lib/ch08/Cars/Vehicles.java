package ch08.Cars;

public class Vehicles {
    double weight, speed;

    Vehicles(double speed, double weight) {
        this.speed = speed;
        this.weight = weight;
    }

    void displayData() {
        System.out.println("Speed : " + speed + "mph");
        System.out.println("Weight : " + weight + "lbs" + "\n");
    }
}