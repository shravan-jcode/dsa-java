package week4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int prev = 0;
        int curr = 1;

        if (n >= 1) System.out.println(prev);
        if (n >= 2) System.out.println(curr);

        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            System.out.println(next);

            prev = curr;
            curr = next;
        }

        sc.close();
    }
}