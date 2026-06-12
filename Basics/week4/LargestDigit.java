package week4;
public class LargestDigit {
    public static void main(String[] args) {
        int number = 12345;

        int max = 0;
        int min = 9;

        while (number > 0) {
            int ld = number % 10;

            if (ld > max) {
                max = ld;
            }

            if (ld < min) {
                min = ld;
            }

            number = number / 10;
        }

        System.out.println("Minimum digit: " + min);
        System.out.println("Maximum digit: " + max);
    }
}