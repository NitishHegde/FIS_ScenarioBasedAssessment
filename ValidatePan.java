import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidatePan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z]{5}(\\d){4}[A-Z]$");
        String pan;

        System.out.println("Enter PAN no:");
        pan = sc.next();

        Matcher matcher = pattern.matcher(pan);

        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid ");
        }
    }
}