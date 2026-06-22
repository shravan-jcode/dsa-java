package Patterns;

public class Pattern10 {

    public static void main(String[] args) {

        int n = 4;

        // ==========================================
        // Pattern :
        //
        // 4 4 4 4 4 4 4
        // 4 3 3 3 3 3 4
        // 4 3 2 2 2 3 4
        // 4 3 2 1 2 3 4
        // 4 3 2 2 2 3 4
        // 4 3 3 3 3 3 4
        // 4 4 4 4 4 4 4
        //
        // Formula :
        // value = max(
        //      abs(i - center),
        //      abs(j - center)
        // )
        //
        // answer = n - value
        // ==========================================

        int size = 2 * n - 1;
        int center = n - 1;

        for (int i = 0; i < size; i++) {

            // ------------------------------
            // Traverse columns
            // ------------------------------
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                // Minimum distance from any border
                int min = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                // Value to print
                int ans = n - min;

                System.out.print(ans + " ");
            }

            System.out.println();
        }
    }
}