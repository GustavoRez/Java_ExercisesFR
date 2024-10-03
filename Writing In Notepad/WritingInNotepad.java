import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingInNotepad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double salary;


        System.out.println("Insert your name:");
            name = sc.next();
            System.out.println("Insert your age:");
            age = sc.nextInt();
            System.out.println("Insert your salary:");
            salary = sc.nextDouble();
            
            sc.close();
        try {
            // Search the path where you want to write the data
            String pathData = "your\\path";

            
            // Create a FileWriter object with the data path
            FileWriter fileWriter = new FileWriter(pathData);

            // Write data at the path to gave
            fileWriter.write("name: " + name + "\n");
            fileWriter.write("age: " + age + "\n");
            fileWriter.write("Salário: " + salary + "\n");

            // Close file
            fileWriter.close();

            System.out.println("Your data was stored with success!");
        } catch (IOException e) {
            System.out.println("Something went wrong... " + e.getMessage());
        }
    }
}
