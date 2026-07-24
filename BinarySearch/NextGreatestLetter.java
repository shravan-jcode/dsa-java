package BinarySearch;

public class NextGreatestLetter {

    static char nextGreatestLetter(char arr[], char target) {

        // If target is greater than or equal to the last element,
        // the answer wraps around to the first character.
        if (target >= arr[arr.length - 1]) {
            return arr[0];
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {

                // arr[mid] can be the answer.
                // Search on the left to see if there is a smaller
                // character that is still greater than target.
                end = mid - 1;

            } else {

                /*
                 * IMPORTANT:
                 *
                 * Your mistake was:
                 *     return arr[mid + 1];
                 *
                 * Why is it wrong?
                 *
                 * 1. If mid is the last index,
                 *    arr[mid + 1] causes ArrayIndexOutOfBoundsException.
                 *
                 * 2. If target == arr[mid], we should NOT return immediately.
                 *    We continue searching on the right because we need
                 *    the FIRST character that is GREATER than target.
                 *
                 * Therefore, move start forward.
                 */

                start = mid + 1;
            }
        }

        /*
         * After the loop ends,
         * start points to the smallest character greater than target.
         */
        return arr[start];
    }

    public static void main(String[] args) {

        char arr[] = { 'a', 'c', 'f', 'j' };

        System.out.println(nextGreatestLetter(arr, 'd')); // f
        System.out.println(nextGreatestLetter(arr, 'a')); // c
        System.out.println(nextGreatestLetter(arr, 'j')); // a
    }
}