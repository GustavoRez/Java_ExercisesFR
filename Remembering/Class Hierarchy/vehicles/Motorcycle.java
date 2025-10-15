package vehicles;

public class Motorcycle extends Vehicle {
    public int engineDisplacement;

    public Motorcycle(String make, String model, int year, int engineDisplacement) {
        super(make, model, year);
        this.engineDisplacement = engineDisplacement;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Displacement: " + engineDisplacement + "cc");
    }

    public void start() {
        System.out.println("*Motorcycle started with a kick*");
    }
}
