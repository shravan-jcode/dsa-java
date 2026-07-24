package BinarySearch;

public class Floor {

    static int flooring(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        // No floor exists
        if (target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }

        return arr[end];
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.println(flooring(arr, 35)); // 30
        System.out.println(flooring(arr, 40)); // 40
        System.out.println(flooring(arr, 65)); // 60
        System.out.println(flooring(arr, 5));  // -1
    }
}