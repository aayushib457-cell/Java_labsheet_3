
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == search) {
                    System.out.println("Element found!");
                    System.out.println("Row = " + (i + 1));
                    System.out.println("Column = " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}