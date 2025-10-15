package devices;

public class Smartphone extends Device {
    public String operatingSystem;

    public Smartphone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    public void makeCall() {
        execute("Calling emergency contact.");
    }

    public void makeCall(String phoneNumber) {
        execute(phoneNumber);
    }

    @Override
    public void power() {
        if (on) {
            System.out.println("Starting up " + operatingSystem + "...");
        } else {
            System.out.println("Shutting down " + operatingSystem + "...");
        }
    }
}