package Patterns;

public class Pattern7 {

    public static void main(String[] args) {

        int n = 5;

        // ==========================================
        // Pattern :
        //
        // *********
        // **** ****
        // ***   ***
        // **     **
        // *       *
        // **     **
        // ***   ***
        // **** ****
        // *********
        //
        // Part 1 : Left Stars
        // Part 2 : Spaces
        // Part 3 : Right Stars (same as left)
        // ==========================================


        // ------------------------------
        // Part 1 : Top Half
        // ------------------------------
        for (int i = n; i >= 1; i--) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // ------------------------------
        // Part 2 : Bottom Half
        // ------------------------------
        for (int i = 2; i <= n; i++) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}