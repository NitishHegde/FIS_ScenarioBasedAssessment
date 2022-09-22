public class Loan_main {
    public static void main(String[] args) {
        Loan_PermanentEmployee PE = new Loan_PermanentEmployee(1285, "Jack Sparrow", 100000);
        Loan_TemporaryEmployee TE = new Loan_TemporaryEmployee(1286, "Johny English", 6, 100);
        PE.calculateSalary();
        TE.calculateSalary();
        Loan_Loan loan = new Loan_Loan();
        double PELoan = loan.calculateLoanAmount(PE);
        double TELoan = loan.calculateLoanAmount(TE);

        System.out.println(PELoan);
        System.out.println(TELoan);
    }
}