package BinarySearch;

class MountainArray {
    private int[] arr;

    public MountainArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] nums = { 1, 3, 5, 7, 6, 4, 2 };
        int target = 4;

        MountainArray mountainArr = new MountainArray(nums);

        int ans = findInMountainArray(target, mountainArr);

        System.out.println("Answer = " + ans);
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        // Step 1: Find Peak
        int peak = findPeak(mountainArr);

        // Step 2: Search Left (Increasing Part)
        int left = binarySearchAsc(mountainArr, 0, peak, target);

        if (left != -1)
            return left;

        // Step 3: Search Right (Decreasing Part)
        return binarySearchDesc(mountainArr, peak + 1, n - 1, target);
    }

    // Find Peak Index
    public static int findPeak(MountainArray arr) {

        int low = 0;
        int high = arr.length() - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // Binary Search for Increasing Part
    public static int binarySearchAsc(MountainArray arr, int low, int high, int target) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int value = arr.get(mid);

            if (value == target)
                return mid;

            if (value < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    // Binary Search for Decreasing Part
    public static int binarySearchDesc(MountainArray arr, int low, int high, int target) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int value = arr.get(mid);

            if (value == target)
                return mid;

            if (value > target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}