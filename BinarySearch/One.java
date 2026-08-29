package BinarySearch;

public class One {

    static int binarySearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > arr[mid]) {
                    end = mid - 1; // Notice this changed
                } else {
                    start = mid + 1; // Notice this changed
                }

            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // Ascending array
        int[] arr1 = { 10, 20, 30, 40, 50, 60, 70 };
        int result1 = binarySearch(arr1, 60);
        System.out.println("Index in ascending array: " + result1);

        // Descending array
        int[] arr2 = { 70, 60, 50, 40, 30, 20, 10 };
        int result2 = binarySearch(arr2, 60);
        System.out.println("Index in descending array: " + result2);
    }
}