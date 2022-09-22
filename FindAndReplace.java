import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String word;
        String replace;

        System.out.println("Enter the line:");
        line = scanner.nextLine();

        System.out.println("Enter the word to search:");
        word = scanner.nextLine();

        System.out.println("Enter the word to be replaced:");
        replace = scanner.nextLine();

        String replacedSentence = line.replace(word, replace);

        if (replacedSentence.equals(line)) {
            System.out.println("The word " + word + " not found");
        } else {
            System.out.println(replacedSentence);
        }
    }
}