package week1;


import java.util.Scanner;

public class Level1 {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Step 2: Take first number input
        System.out.println("Enter num a: ");
        int a = sc.nextInt();

        // Step 3: Take second number input
        System.out.println("Enter num b: ");
        int b = sc.nextInt();

        // Step 4: Call remainder function
        int result = remainder(a, b);

        // Step 5: Print result
        System.out.println("Result: " + result);

        // Step 6: Print simple message
        System.out.println("Hello world");

        // Step 7: Call info function
        info("Shravan", 21, "Lanja");

        // Step 8: Swap using third variable
        swap(a, b);

        // Step 9: Swap without third variable
        swapWithoutThird(a, b);

        // Step 10: Close scanner
        sc.close();
    }

    // Function to print personal information
    public static void info(String name, int age, String city) {

        System.out.println(
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "City: " + city + "\n"
        );
    }

    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to subtract two numbers
    public static int sub(int a, int b) {
        return a - b;
    }

    // Function to multiply two numbers
    public static int mult(int a, int b) {
        return a * b;
    }

    // Function to divide two numbers
    public static int div(int a, int b) {

        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }

        return a / b;
    }

    // Function to find remainder
    public static int remainder(int a, int b) {
        return a % b;
    }

    // Swap WITH third variable (kept as it is)
    public static void swap(int a, int b) {

        System.out.println("Before swap (with third variable): a = " + a + " b = " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap (with third variable): a = " + a + " b = " + b);
    }

    // NEW: Swap WITHOUT third variable (using addition/subtraction)
    public static void swapWithoutThird(int a, int b) {

        System.out.println("Before swap (without third variable): a = " + a + " b = " + b);

        // Swap logic
     a = a ^ b;
    b = a ^ b;
    a = a ^ b;


        System.out.println("After swap (without third variable): a = " + a + " b = " + b);
    }
}