package devices;

public class Device {
    public String brand;
    public String model;
    public boolean on;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.on = false;
    }

    public void status() {
        System.out.println("Brand: " + brand + " | Model: " + model + " | Power: " + (on ? "On" : "Off"));
        System.out.println();
    }

    public void power() {
        on = !on;
        System.out.println("The device is now " + (on ? "On" : "Off"));
    }

    public void execute(String command) {
        if (on) {
            System.out.println(command);
        } else {
            System.out.println("Cannot execute command. The device is off.");
        }
    }
}