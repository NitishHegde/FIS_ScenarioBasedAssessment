import java.util.Scanner;

public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary;
        double rating;
        double incr = 0.0;
        		
        System.out.println("Enter  salary");
        salary = scanner.nextInt();
        System.out.println("Enter rating");
        rating = scanner.nextDouble();
        
        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
        } else {
            if (rating <= 3) {
                incr = salary * 10.0 / 100.0;    
            } else if (rating <= 4) {
                incr = salary * 25.0 / 100.0;
            } else if (rating <= 5) {
                incr = salary * 30.0 / 100.0;
            }

            salary += incr;
            System.out.println(salary);
        }
    }
}