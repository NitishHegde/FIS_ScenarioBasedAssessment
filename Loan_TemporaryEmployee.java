public class Loan_TemporaryEmployee extends Loan_Employee {
    private int hoursWorked;
    private int hourlyWages;

    public Loan_TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    @Override
    public void calculateSalary() {
        double salary = hoursWorked * hourlyWages;
        setSalary(salary);
    }
}