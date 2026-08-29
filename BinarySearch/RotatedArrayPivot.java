package BinarySearch;

public class RotatedArrayPivot {

    // Find pivot = index of smallest element
    static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // mid is greater than next element
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }

            // mid is smaller than previous element
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid;
            }

            // Left side is sorted
            if (nums[start] < nums[mid]) {
                start = mid + 1;
            }

            // Right side is sorted
            else if (nums[mid] < nums[end]) {
                end = mid;
            }

            // Duplicates
            else {
                start++;

                if (nums[mid] == nums[end]) {
                    end--;
                }
            }
        }

        return start;
    }

    // Number of rotations
    static int countRotations(int[] nums) {
        return findPivot(nums);
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 6, 0, 1, 2, 2};

        int pivot = findPivot(nums);

        System.out.println("Pivot index: " + pivot);
        System.out.println("Array rotated: " + countRotations(nums) + " times");
    }
}