import java.util.Scanner;

public class ArrayCompatibility {

    public static boolean compatibility(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] < arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        int[] a1, a2;

        System.out.println("Enter the size for First array:");
        m = scanner.nextInt();
        if (m <= 0) {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        a1 = new int[m];

        System.out.println("Enter the elements for First array:");

        for (int i = 0; i < m; ++i) {
            a1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size for Second array:");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        a2 = new int[n];

        System.out.println("Enter the elements for Second array:");

        for (int j = 0; j < n; ++j) {
            a2[j] = scanner.nextInt();
        }

        if (compatibility(a1, a2)) {
            System.out.println(" Compatible");
        } else {
            System.out.println(" Not Compatible");
        }
    }
}