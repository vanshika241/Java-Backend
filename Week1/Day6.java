import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.next();

        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);

        sc.close();
    }
}
