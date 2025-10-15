package devices;

public class Computer extends Device {
    public String operatingSystem;

    public Computer(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    public void executeAction() {
        execute("Opening " + operatingSystem + " default program.");
    }
    
    public void executeAction(String program) {
        execute(program);
    }

    @Override
    public void power() {
        if (on) {
            System.out.println("Booting up " + operatingSystem + "...");
        } else {
            System.out.println("Shutting down " + operatingSystem + "...");
        }
    }
}