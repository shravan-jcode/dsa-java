
package CyclicSort;

import java.util.Arrays;

/**
 * CyclicSort
 */
public class CyclicSort {

    public static void cyclicSort(int arr[]) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 5, 2, 1, 4};

        cyclicSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}