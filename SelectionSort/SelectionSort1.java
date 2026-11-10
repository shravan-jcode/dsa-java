package SelectionSort;

public class SelectionSort1 {

    public static int getMaxIndex(int[] arr, int start, int end) {

        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int last = arr.length - i - 1;

            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}