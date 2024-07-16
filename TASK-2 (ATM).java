import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin;

    public ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Change PIN");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void withdrawCash() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = getDoubleInput();
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
        }
    }

    public void depositCash() {
        System.out.print("Enter the amount to deposit: $");
        double amount = getDoubleInput();
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: $" + balance);
    }

    public void changePIN() {
        System.out.print("Enter your current PIN: ");
        int currentPIN = getIntInput();
        if (currentPIN == pin) {
            System.out.print("Enter your new PIN: ");
            pin = getIntInput();
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Invalid PIN!");
        }
    }

    private int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private double getDoubleInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1234, 1000.0); // create an ATM object with PIN 1234 and initial balance 1000.0
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.withdrawCash();
                    break;
                case 3:
                    atm.depositCash();
                    break;
                case 4:
                    atm.changePIN();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}