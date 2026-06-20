package Patterns;

public class Pattern3 {
    public static void main(String[] args) {

        int n = 5;

        // ==============================
        // Pattern 7 : Pyramid Star Pattern
        //
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        // ==============================

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println();


        // ==============================
        // Pattern 8 : Inverted Pyramid
        //
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        // ==============================

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}