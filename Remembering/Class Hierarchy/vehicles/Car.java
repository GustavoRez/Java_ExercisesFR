package vehicles;

public class Car extends Vehicle {
    public int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }

    public void start() {
        System.out.println("*Car started with a key*");
    }
}
