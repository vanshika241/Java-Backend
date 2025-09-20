public class Day2 {
    public static void main(String[] args) {
        int age = 26;
        String name = "CodeVibes";
        double marks = 8.5;
        boolean isStudent = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Is Student: " + isStudent);

        byte b = 100;
        short s = 30000;
        int i = 123456;
        long l = 1234567890L;
        float f = 12.34f;
        double d = 12345.6789;
        char c = 'A';
        boolean flag = false;

        System.out.println("\n--- Primitive Data Types ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        String str = "Hello, Java!";
        int[] numbers = {10, 20, 30};

        System.out.println("\n--- Non-Primitive Data Types ---");
        System.out.println("String: " + str);
        System.out.println("Array element [0]: " + numbers[0]);
    }
}
