package Patterns;

public class Pattern6 {

    public static void main(String[] args) {

        int n = 5;

        // ==========================================
        // Pattern :
        //
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        //
        // Part 1 : Increasing Numbers with Counter
        // ==========================================

        int k = 1;

        for (int i = 1; i <= n; i++) {

            // ------------------------------
            // Part 1 : Printing Numbers
            //
            // Row 1 -> 1
            // Row 2 -> 2 3
            // Row 3 -> 4 5 6
            // Row 4 -> 7 8 9 10
            // Row 5 -> 11 12 13 14 15
            //
            // Logic : Use a single counter and increment it
            // ------------------------------
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }

            System.out.println();
        }
    }
}