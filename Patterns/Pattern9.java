package Patterns;

public class Pattern9 {

    public static void main(String[] args) {

        int n = 4;

        // ==========================================
        // Pattern :
        //
        // ****
        // *  *
        // *  *
        // ****
        //
        // Part 1 : First Row
        // Part 2 : Middle Rows
        // Part 3 : Last Row
        // ==========================================

        for (int i = 1; i <= n; i++) {

            // ------------------------------
            // Part 1 : First Row
            //
            // Row 1 -> ****
            // ------------------------------
            if (i == 1) {

                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }

            }

            // ------------------------------
            // Part 2 : Middle Rows
            //
            // Row 2 -> *    *
            // Row 3 -> *    *
            //
            // Print :
            // 1 star
            // n-2 spaces
            // 1 star
            // ------------------------------
            else if (i < n) {

                System.out.print("* ");

                for (int j = 1; j <= n - 2; j++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            // ------------------------------
            // Part 3 : Last Row
            //
            // Row 4 -> ****
            // ------------------------------
            else {

                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }

            }

            System.out.println();
        }
    }
}