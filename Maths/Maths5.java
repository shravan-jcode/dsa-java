package Maths;

public class Maths5 {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 18;

        while (num2 != 0) {

            int remainder = num1 % num2;

            num1 = num2;

            num2 = remainder;
        }

        System.out.println("GCD = " + num1);
    }
}