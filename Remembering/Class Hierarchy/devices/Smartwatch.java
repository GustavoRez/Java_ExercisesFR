package devices;

public class Smartwatch extends Device{
    public Smartwatch(String brand, String model) {
        super(brand, model);
    }

    public void trackActivity() {
        execute("Monitoring heart rate...");
    }

    @Override
    public void power() {
        if (on) {
            System.out.println("Smartwatch is now active.");
        } else {
            System.out.println("Smartwatch is now inactive.");
        }
    }
}