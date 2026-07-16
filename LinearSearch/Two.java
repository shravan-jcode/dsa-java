package LinearSearch;

public class Two {

    public static void main(String[] args) {

        int[] arr = { 12, 22, 3, 33, 765 };

        int count = countEvenDigitNumbers(arr);

        System.out.println("Array has " + count + " numbers with even digits");
    }

    static int countEvenDigitNumbers(int[] arr) {

        int count = 0;

        for (int num : arr) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean hasEvenDigits(int num) {
        return countDigits(num) % 2 == 0;
    }

    static int countDigits(int num) {

        num = Math.abs(num);

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
