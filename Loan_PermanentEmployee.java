public class Loan_PermanentEmployee extends Loan_Employee {
    private double basicPay;

    public Loan_PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    @Override
    public void calculateSalary() {
        double pfAmount = basicPay * 0.12;
        double salary = basicPay - pfAmount;
//        System.out.println(salary);
        setSalary(salary);
    }
}