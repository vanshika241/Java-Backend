import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("For loop: " + i);
        }

        int j = 1;
        while (j <= n) {
            System.out.println("While loop: " + j);
            j++;
        }

        int k = 1;
        do {
            System.out.println("Do-while loop: " + k);
            k++;
        } while (k <= n);

        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.println("For-each loop: " + num);
        }

        sc.close();
    }
}
