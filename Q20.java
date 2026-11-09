
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[][] = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number of subjects for Student " + (i + 1) + ": ");
            int n = sc.nextInt();

            marks[i] = new int[n];

            System.out.println("Enter marks:");

            for (int j = 0; j < n; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nStudent Marks:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}