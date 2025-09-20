public class Day3 {
    public static void main(String[] args) {
        int numInt = 100;
        double numDouble = numInt;
        System.out.println("Widening Casting (int to double): " + numDouble);

        double d = 99.99;
        int i = (int) d;
        System.out.println("Narrowing Casting (double to int): " + i);

        int a = 10, b = 5;
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n--- Logical Operators ---");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("\n--- Assignment Operators ---");
        int z = 10;
        z += 5;
        System.out.println("z += 5: " + z);
        z -= 3;
        System.out.println("z -= 3: " + z);
        z *= 2;
        System.out.println("z *= 2: " + z);
        z /= 4;
        System.out.println("z /= 4: " + z);
        z %= 3;
        System.out.println("z %= 3: " + z);

        System.out.println("\n--- Unary Operators ---");
        int p = 7;
        System.out.println("p++: " + (p++));
        System.out.println("After p++: " + p);
        System.out.println("++p: " + (++p));
        System.out.println("p--: " + (p--));
        System.out.println("After p--: " + p);
        System.out.println("--p: " + (--p));

        System.out.println("\n--- Bitwise Operators ---");
        int m = 5, n = 3;
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("~m: " + (~m));
        System.out.println("m << 1: " + (m << 1));
        System.out.println("m >> 1: " + (m >> 1));
    }
}
