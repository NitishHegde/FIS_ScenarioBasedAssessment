import java.util.Scanner;

public class NumberPalindrome {


    private static boolean isPalindrome(int num) {
        String numString = String.valueOf(num);
        int size = numString.length();

        for (int i = 0; i < size / 2; ++i) {
            if (numString.charAt(i) != numString.charAt(size - i -1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid");
        } else {
            if (isPalindrome(num)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }
}