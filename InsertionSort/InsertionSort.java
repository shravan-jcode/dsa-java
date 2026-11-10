package InsertionSort;

public class InsertionSort {

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Put key in its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        insertionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
