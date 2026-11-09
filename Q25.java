
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        int mainSum = 0;
        int secondarySum = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            mainSum += arr[i][i];
            secondarySum += arr[i][2 - i];
        }

        System.out.println("Main Diagonal Sum = " + mainSum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);

        sc.close();
    }
}