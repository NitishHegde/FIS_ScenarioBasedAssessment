import java.util.Scanner;

public class FindSeason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        String season = "";

        System.out.println("Enter month:");
        month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid ");
        } else {
            if (month == 3 || month == 4 || month == 5) {
                season = "Spring";
            } else if (month == 9 || month == 10 || month == 11) {
                season = "Autumn";
            } else if (month == 6 || month == 7 || month == 8) {
                season = "Summer";
            } else if (month == 1 || month == 2 || month == 12) {
                season = "Winter";
            }

            System.out.println(season);
        }

    }
}