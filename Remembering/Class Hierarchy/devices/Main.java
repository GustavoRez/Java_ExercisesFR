package devices;

public class Main {
    public static void main(String[] args) {
        Device list [] = {new Computer("Dell", "XPS 15", "Windows 11"),
                     new Computer("Apple", "MacBook Pro 16", "macOS Ventura"),
                     new Smartphone("Samsung", "Galaxy S23", "Android 14"),
                     new Smartphone("Apple", "iPhone 15", "iOS 17"),
                     new Smartwatch("Apple", "Watch Series 9"),
                     new Smartwatch("Samsung", "Galaxy Watch 6")};
    
        for (Device device : list) {
            device.power();
            if (device instanceof Computer) {
                ((Computer) device).executeAction();
            } else if (device instanceof Smartphone) {
                ((Smartphone) device).makeCall();
            } else if (device instanceof Smartwatch) {
                ((Smartwatch) device).trackActivity();
            }
            device.status();
        }
    }
}