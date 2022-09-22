import java.util.Scanner;

public class BA_MainFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Savings ");
        System.out.println("2. Current ");
        System.out.println("Enter the choice:");
        int choice = sc.nextInt();

        System.out.println("Account number");
        String accountNumber = sc.next();

        System.out.println("Customer Name");
        String customerName = sc.next();

        System.out.println("Balance amount");
        double balance = sc.nextDouble();

        System.out.println("number of years");
        int noOfYears = sc.nextInt();

        System.out.println("Customer Name " + customerName);
        System.out.println("Account Number " + accountNumber);
        System.out.println("Account Balance "  + balance);

        switch (choice) {
            case 1: {
                BA_SavingsAccount savingsAccount = new BA_SavingsAccount(accountNumber, customerName, balance);
                System.out.println("Maintenance Charge for SA is Rs " + savingsAccount.calculateMaintenanceCharge(noOfYears));
                break;
            }
            case 2: {
                BA_CurrentAccount currentAccount = new BA_CurrentAccount(accountNumber, customerName, balance);
                System.out.println("Maintenance Charge for CA is Rs " + currentAccount.calculateMaintenanceCharge(noOfYears));
            }
        }
    }
}