package Patterns;

public class Pattern4 {

    public static void main(String[] args) {

        int n = 5;

        // ==========================================
        // Pattern 1 : Right Triangle Star Pattern
        //
        // *
        // * *
        // * * *
        // * * * *
        // ==========================================

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();


        // ==========================================
        // Pattern 2 : Inverted Right Triangle
        //
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // ==========================================

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();


        // ==========================================
        // Pattern 3 : 0-1 Triangle Pattern
        //
        // (For n = 5)
        //
        // 
        // 1
        // 01
        // 101
        // 0101
        // ==========================================

        int start;

        for (int i = 0; i < n; i++) {

            // Decide starting digit for each row
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            for (int j = 0; j < i; j++) {

                System.out.print(start);

                // Toggle between 0 and 1
                start = 1 - start;
            }

            System.out.println();
        }
    }
}