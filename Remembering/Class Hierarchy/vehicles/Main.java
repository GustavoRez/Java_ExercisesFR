package vehicles;
public class Main {
    public static void main(String[] args) {
        Vehicle list[] = { new Car("Honda", "Civic", 2000, 4),
                        new Car("Toyota", "Corolla", 2025, 4),
                        new Motorcycle("Yamaha", "R1", 2020, 998),
                        new Motorcycle("Ducati", "Panigale V4", 2023, 1103) };

        for(int i = 0; i < list.length; i++) {
            list[i].displayInfo();
            list[i].start();
            System.out.println();
        }
    }
}
