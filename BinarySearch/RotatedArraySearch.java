package BinarySearch;

public class RotatedArraySearch {

    // EXISTING APPROACH
    static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }


    // PIVOT APPROACH
    static int searchUsingPivot(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Target is the pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // Target lies in the left sorted part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Target lies in the right sorted part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    // FIND PIVOT
    static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if mid itself is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }

            // Check if element before mid is the pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid;
            }

            // Left side is sorted, so pivot is on right
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }

            // Otherwise pivot is on left
            else {
                end = mid - 1;
            }
        }

        return -1;
    }


    // NORMAL BINARY SEARCH
    static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        // Existing method
        int ans1 = search(nums, target);
        System.out.println("Existing approach: " + ans1);

        // Pivot method
        int ans2 = searchUsingPivot(nums, target);
        System.out.println("Pivot approach: " + ans2);

        // Show pivot
        int pivot = findPivot(nums);
        System.out.println("Pivot index: " + pivot);
    }
}