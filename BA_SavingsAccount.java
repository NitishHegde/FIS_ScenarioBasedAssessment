public class BA_SavingsAccount extends BA_account implements BA_MaintananceCharge {
    public BA_SavingsAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public float calculateMaintenanceCharge(float noOfYears) {
        return (50.0f * noOfYears) + 50.0f;
    }
}