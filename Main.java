package banksystem;
import java.util.Scanner;

interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
}

class BankAccount implements BankOperations {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance += amount;
            System.out.println("Balance = " + format(balance));
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
            System.out.println("Balance remains " + format(balance));
        } else {
            balance -= amount;
            System.out.println(
                "Withdrawal successful, Balance = " + format(balance)
            );
        }
    }

    private String format(double value) {
        if (value == (long) value) {
            return String.format("%.0f", value);
        }
        return String.format("%.2f", value);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}