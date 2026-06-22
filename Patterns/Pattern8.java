package Patterns;

public class Pattern8 {

    public static void main(String[] args) {

        int n = 5;

        // ==========================================
        // Pattern :
        //
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // *********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        //
        // Part 1 : Left Stars
        // Part 2 : Middle Spaces
        // Part 3 : Right Stars
        // ==========================================

        // ------------------------------
        // Upper Half (including middle row)
        // ------------------------------
        for (int i = 1; i <= n; i++) {

            // ------------------------------
            // Part 1 : Left Stars
            //
            // Row 1 -> 1 star
            // Row 2 -> 2 stars
            // Row 3 -> 3 stars
            // ...
            // ------------------------------
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // ------------------------------
            // Part 2 : Middle Spaces
            //
            // Row 1 -> 7 spaces
            // Row 2 -> 5 spaces
            // Row 3 -> 3 spaces
            // Row 4 -> 1 space
            //
            // Formula:
            // spaces = 2 * (n - i) - 1
            // ------------------------------
            if (i != n) {
                for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                    System.out.print(" ");
                }
            }

            // ------------------------------
            // Part 3 : Right Stars
            //
            // Row 1 -> 1 star
            // Row 2 -> 2 stars
            // Row 3 -> 3 stars
            // ...
            // ------------------------------
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ------------------------------
        // Lower Half
        // ------------------------------
        for (int i = n - 1; i >= 1; i--) {

            // Part 1 : Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Part 2 : Middle Spaces
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }

            // Part 3 : Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}