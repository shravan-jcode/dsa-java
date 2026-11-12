package Patterns;

public class Pattern13 {
 
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = i; j <= 5; j++) {
                System.out.print((char)('A' + j - 1) + " ");
            }

            System.out.println();
        }
    }
    
// E
// D E
// C D E
// B C D E
// A B C D E
}
