package Patterns;

// Step-by-step explanation
// 1. 'A'

// In Java, characters have numeric Unicode values.
// - A = 65
// - B = 66
// - C = 67
// - D = 68
// - E = 69
// 2. 'A' + j - 1

// Suppose j = 1:
// 'A' + 1 - 1 = 65

// Suppose j = 2:
// 'A' + 2 - 1 = 66

// 3. (char)

// The (char) converts the numeric value back into a character.

// For example:
// (char) 65  // A
// (char) 66  // B
// (char) 67  // C

public class Pattern11 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }

        // A
        // AB
        // ABC
        // ABCD
        // ABCDE

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }

        // ABCDE
        // ABCD
        // ABC
        // AB
        // A

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1));
            }
            System.out.println();
        }
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE
    }
}