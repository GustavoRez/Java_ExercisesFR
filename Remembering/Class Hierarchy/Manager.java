public class Manager extends Employee {
    public String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Department: " + department);
        System.out.println();
    }
}
