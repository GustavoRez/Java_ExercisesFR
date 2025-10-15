package vehicles;
public class Vehicle {
    public String make;
    public String model;
    public int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + " - Model: " + model);
        System.out.print("Year: " + year + " - ");
    }

    public void start() {
        System.out.println("Vehicle started.");
    }
}
