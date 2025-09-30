package ATM;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank funds = new Bank(500.00f);
        int choice = 1;

        System.out.printf("Initial funds: R$%.2f", funds.getFunds());
        System.out.println();

        while (choice > 0 && choice < 4) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Check balance");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    double amount = sc.nextDouble();
                    funds.depositMoney(amount);
                    System.out.println("Deposit successful!");
                    break;

                case 2:
                    System.out.println("Enter withdraw amount:");
                    double amountW = sc.nextDouble();
                    funds.withdrawMoney(amountW);
                    break;

                case 3:
                    System.out.printf("Current balance: R$%.2f", funds.getFunds());
                    System.out.println();
                    break;

                default:
                    break;

            }
        }
        sc.close();
    }
}