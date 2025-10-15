public class Seler extends Employee{
    public double commission;

    public Seler(String name, double salary, double commission) {
        super(name, salary);
        this.commission = commission;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Commission: " + commission);
        System.out.println();
    }
}
