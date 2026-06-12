package week4;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int dummy = n;

        // Step 1: Count digits
        int count = 0;
        while (dummy > 0) {
            count++;
            dummy = dummy / 10;
        }

        // Step 2: Calculate sum of powers
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;

            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * ld;   // ✅ correct power logic
            }

            sum += power;
            n = n / 10;  // ✅ don't forget this
        }

        // Step 3: Compare
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}