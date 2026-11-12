package Patterns;

public class Pattern12 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Print increasing alphabets
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }

            // Print decreasing alphabets
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }

            System.out.println();
        }
    }

//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA
}
