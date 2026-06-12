package week4;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not prime");
            return;
        }

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {   // ✅ correct condition
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime");
        }

        sc.close();
    }
}