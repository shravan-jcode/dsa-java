package Maths;

public class Maths3 {
    public static void main(String[] args) {

        int num = 371;
        int originalNum = 371;

        int sumOfCubes = 0;

        while (num > 0) {

            int lastDigit = num % 10;

            int cubeOfDigit = lastDigit * lastDigit * lastDigit;

            sumOfCubes += cubeOfDigit;

            num = num / 10;
        }

        if (sumOfCubes == originalNum) {
            System.out.println("Armstrong Number : " + sumOfCubes);
        }
        else {
            System.out.println("Not Armstrong Number : " + sumOfCubes);
        }
    }
}