package BinarySearch;

public class RotationCount {

    // Rotation Count
    static int rotationCount(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Array is already sorted
            if (nums[start] <= nums[end]) {
                return start;
            }

            // mid is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }

            // mid - 1 is the pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }

            // Pivot is in left half
            else {
                end = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int count = rotationCount(nums);

        System.out.println("Array rotated " + count + " times");
    }
}