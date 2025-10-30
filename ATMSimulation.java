// Program 42: ATM Simulation
import java.util.*;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        int pin = 1234;

        System.out.print("Enter PIN: ");
        int userPin = sc.nextInt();

        if (userPin != pin) {
            System.out.println("Invalid PIN! Access Denied.");
            sc.close();
            return;
        }

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Successfully Deposited ₹" + deposit);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Successfully Withdrawn ₹" + withdraw);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close(); // ✅ Scanner closed before exit
                    return;

                default:
                    System.out.println("Invalid choice! Please select between 1–4.");
            }
        }
    }
}