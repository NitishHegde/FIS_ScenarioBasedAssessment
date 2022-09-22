import java.util.Scanner;

public class StudentAverageAndGrade {
    public static Student studentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id:");
        int id = scanner.nextInt();

        System.out.println("Entername:");
        String name = scanner.next();

        int subjects = 0;

        while (true) {
            System.out.println("Enter  no of subjects:");
            subjects = scanner.nextInt();

            if (subjects <= 0) {
                System.out.println("Invalid");
            } else {
                break;
            }
        }

        int[] marks = new int[subjects];

        for (int i = 0; i < subjects; ++i) {
            int mark = 0;

            while (true) {
                System.out.println("Enter mark for subject " + (i + 1) + ":");
                mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid Mark");
                } else {
                    break;
                }
            }

            marks[i] = mark;
        }

        Student student = new Student(id, name, marks);

        return student;
    }

    public static void main(String[] args) {
        Student student = studentDetails();
        student.calculateAvg();
        student.findGrade();

        System.out.println("Id:"  + student.getId());
        System.out.println("Name:" + student.getName());
        System.out.println("Average:" + student.getAverage());
        System.out.println("Grade:" + student.getGrade());
    }
}