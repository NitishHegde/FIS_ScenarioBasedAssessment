import java.util.Scanner;

public class FindAverageAge {
    public static double calculateAverage(int[] age) {
        double total = 0.0; 
        for (int i : age) {
            total += i;
        }
        return total / (double) age.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no.of employees:");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Please enter a valid employee count");
        } else {
            System.out.println(String.format("Enter the age for %d employees:", n));
            
            int[] age = new int[n];
            boolean Valid = true;

            for (int i = 0; i < n; ++i) {
                int a = scanner.nextInt();

                if (a < 28 || a > 40) {
                    Valid = false;
                    break;
                }

                age[i] = a;
            }


            if (Valid == true) {
                double average = calculateAverage(age);
                System.out.println(String.format("The average age is %.2f", average));
            } else {
                System.out.println("Invalid");
            }
        }
    }
}