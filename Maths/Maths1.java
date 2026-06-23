package Maths;

public class Maths1 {
    public static void main(String[] args) {

        int number = 1234;
        int count = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            count++;

            number = number / 10;   // Remove last digit
        }

        System.out.println(count);
    }
}