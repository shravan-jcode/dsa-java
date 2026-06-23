package Maths;

import java.util.ArrayList;

public class Maths4 {

    public static void main(String[] args) {

        int num = 36;

        int factorCount = 0;

        ArrayList<Integer> largeFactors = new ArrayList<>();

        System.out.print("Factors of " + num + " are : ");

        for (int  i = 1; i * i <= num; i++) {

            if (num % i == 0) {

                int pairedFactor = num / i;

                // Small factor
                System.out.print(i + " ");

                factorCount++;

                // Store large factor
                if (i != pairedFactor) {

                    largeFactors.add(pairedFactor);

                    factorCount++;
                }
            }
        }

        // Print stored factors in reverse order

        for (int i = largeFactors.size() - 1; i >= 0; i--) {

            System.out.print(largeFactors.get(i) + " ");
        }

        System.out.println();

        System.out.println("Number of factors = " + factorCount);

        if (factorCount == 2) {

            System.out.println(num + " is Prime");

        } else {

            System.out.println(num + " is Not Prime");
        }
    }
}