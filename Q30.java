
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        int zero = 0;
        int nonZero = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 0) {
                    zero++;
                } else {
                    nonZero++;
                }
            }
        }

        System.out.println("Zero Elements = " + zero);
        System.out.println("Non-Zero Elements = " + nonZero);

        if (zero > nonZero) {
            System.out.println("The Matrix is a Sparse Matrix");
        } else {
            System.out.println("The Matrix is not a Sparse Matrix");
        }

        sc.close();
    }
}