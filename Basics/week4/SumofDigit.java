package week4;

public class SumofDigit {
    public static void main(String[] args) {
        int number = 222;
        int sum = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            sum += lastdigit;
            number = number / 10;
        }
        System.out.println(sum);
    }

}
