public class sistema {
    public static void main(String[] args) {
        Employee emp[] = { new Manager("John", 5000, "IT"),
                new Seler("Ana", 3000, 500),
                new Seler("Peter", 2800, 300) };

        for (int i = 0; i < emp.length; i++) {
            emp[i].showInformation();
        }
    }
}
