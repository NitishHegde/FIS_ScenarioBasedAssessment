public class Loan_Loan {
    public double calculateLoanAmount(Loan_Employee employee) {
        double loan=0.0;
//        System.out.println(employee.getSalary());
        if (employee instanceof Loan_PermanentEmployee) {
            loan = (employee.getSalary() * 15.0) / 100.0;
//            System.out.println(loan);
        } else if (employee instanceof Loan_TemporaryEmployee) {
            loan = (employee.getSalary() * 10.0) / 100.0;
        }
  
        return loan;
    }
}