package ATM;
public class Bank {
    private double money;

    public Bank(double money) {
        this.money = money;
    }

    public double getFunds() {
        return money;
    }

    public double depositMoney(double value) {
        this.money += value;
        return this.money;
    }

    public double withdrawMoney(double value) {
        if (value <= this.money) {
            this.money -= value;
            System.out.println("Withdrawal successful!");
            return this.money;
        } else {
            System.out.println("Insufficient funds.");
            return this.money;
        }
    }
}