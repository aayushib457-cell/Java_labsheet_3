
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int result[] = new int[5];
        int count = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}