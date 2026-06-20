package Patterns;

public class Pattern2 {
    public static void main(String[] args) {

        int n = 5;

        // ==============================
        // Pattern 5 : Inverted Star Triangle
        //
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // ==============================

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        // ==============================
        // Pattern 6 : Inverted Number Triangle
        //
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // ==============================

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}