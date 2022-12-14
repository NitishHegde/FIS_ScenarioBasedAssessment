import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Name {
    public static Validate validateEmployeeName() {
        return name -> {
            Pattern pattern = Pattern.compile("^[a-zA-Z\\s]{5,20}$");
            Matcher matcher = pattern.matcher(name);

            return matcher.matches();
        };
    }

    public static Validate validateProductName() {
        return name -> {
            Pattern pattern = Pattern.compile("^[a-zA-Z]\\d{5}$");
            Matcher matcher = pattern.matcher(name);

            return matcher.matches();
        };
    }

    public static void main(String[] args) {
    	System.out.println("Enter name and product");
        Scanner sc = new Scanner(System.in);
        String employee = sc.nextLine();
        String product = sc.nextLine();

        Validate employeeValidation = validateEmployeeName();
        boolean validEmployee = employeeValidation.validateName(employee);

        if (validEmployee) {
            System.out.println("Employee name is valid");
        } else {
            System.out.println("Employee name is invalid");
        }

        Validate productValidation = validateProductName();
        boolean validProduct = productValidation.validateName(product);

        if (validProduct) {
            System.out.println("Product name is valid");
        } else {
            System.out.println("Product name is invalid");
        }
    }
}