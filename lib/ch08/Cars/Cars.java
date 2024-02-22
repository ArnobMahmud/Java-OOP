package ch08.Cars;

public class Cars extends Vehicles {
    String name;

    Cars(double speed, double weight, String name) {
        super(speed, weight);
        this.name = name;
    }

    @Override
    void displayData() {
        System.out.println("Name : " + name);
        super.displayData();
    }
}
