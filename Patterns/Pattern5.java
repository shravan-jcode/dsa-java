package Patterns;

public class Pattern5 {

    public static void main(String[] args) {

        int n = 4;

        // ==========================================
        // Pattern :
        //
        // 1      1
        // 12    21
        // 123  321
        // 12344321
        //
        // Part 1 : Increasing Numbers
        // Part 2 : Spaces
        // Part 3 : Decreasing Numbers
        // ==========================================

        for (int i = 1; i <= n; i++) {

            // ------------------------------
            // Part 1 : Increasing Numbers
            //
            // Row 1 -> 1
            // Row 2 -> 12
            // Row 3 -> 123
            // Row 4 -> 1234
            // ------------------------------
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }


            // ------------------------------
            // Part 2 : Spaces
            //
            // Row 1 -> 6 spaces
            // Row 2 -> 4 spaces
            // Row 3 -> 2 spaces
            // Row 4 -> 0 spaces
            //
            // Formula :
            // spaces = 2 * (n - i)
            // ------------------------------
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }


            // ------------------------------
            // Part 3 : Decreasing Numbers
            //
            // Row 1 -> 1
            // Row 2 -> 21
            // Row 3 -> 321
            // Row 4 -> 4321
            //
            // Start from i and go down to 1
            // ------------------------------
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}