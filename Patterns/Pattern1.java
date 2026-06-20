package Patterns;

public class Pattern1 {
    public static void main(String[] args) {

        int n = 4;

        // ==============================
        // Pattern 1 : Square Star Pattern
        //
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        // ==============================

        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */


        // ==============================
        // Pattern 2 : Right Triangle Star Pattern
        //
        // *
        // * *
        // * * *
        // * * * *
        // ==============================

        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */


        // ==============================
        // Pattern 3 : Number Triangle
        //
        // 1
        // 12
        // 123
        // 1234
        // ==============================

        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */


        // ==============================
        // Pattern 4 : Same Number Triangle
        //
        // 1
        // 22
        // 333
        // 4444
        // ==============================

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}