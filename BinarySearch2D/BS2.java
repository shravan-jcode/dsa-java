package BinarySearch2D;

public class BS2 {

    static int[] search(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        // Imagine the 2D array as a 1D sorted array
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Convert 1D index into 2D row and column
            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {
                return new int[] {row, col};
            }

            if (arr[row][col] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        int[] result = search(arr, 3);

        System.out.println(result[0] + " " + result[1]);
    }
}