package week3;
import java.util.Scanner;

public class PrintNum {

    // 1. Print 1 to N
    public static void oneToN(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // 2. Print N to 1
    public static void NtoOne(int n){
        for (int i = n; i >= 1; i--) {   // ✅ fixed condition
            System.out.println(i);
        }
    }

    // 3. Even Odd
    public static void evenOdd(int n){
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
        }
    }

    // 4. Sum of numbers
    public static int sumOfNum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 5. Factorial
    public static int factorial(int n){
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    // 6. Count digits
    public static int countDigit(int n){
        int count = 0;

        if(n == 0) return 1; // edge case

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // 7. Reverse number
    public static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        return rev;
    }

    // 8. Palindrome check
    public static boolean palindrome(int n){
        if(n < 0) return false;

        int original = n;
        int rev = 0;

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }

        return original == rev;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        oneToN(n);
        System.out.println("-----");

        NtoOne(n);
        System.out.println("-----");

        evenOdd(n);
        System.out.println("-----");

        System.out.println("Sum: " + sumOfNum(n));
        System.out.println("Factorial: " + factorial(n));
        System.out.println("Digit count: " + countDigit(n));
        System.out.println("Reverse: " + reverse(n));

        if(palindrome(n)){
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }

        sc.close();
    }
}