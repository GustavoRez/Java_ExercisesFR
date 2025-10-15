public class Seler extends Employee{
    public double comission;

    public Seler(String name, double salary, double comission) {
        super(name, salary);
        this.comission = comission;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Comission: " + comission);
        System.out.println();
    }
}
