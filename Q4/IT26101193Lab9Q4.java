import java.util.Scanner;

public class IT26101193Lab9Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Student Name: ");
            String name = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();

            double finalMark = calcFinalMark(assignmentMark, examMark);
            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
            System.out.println();
        }

        scanner.close();
    }

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println("Name\t\tFinal Mark\tGrade");
        System.out.printf("%s\t\t%.2f\t\t%c\n", name, finalMark, grade);
    }
}
