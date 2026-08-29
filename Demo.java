/**
 * Demo
 */
public class Demo {

    // Binary Search - array must be sorted
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // Find peak index in a mountain array
    static int mountain(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] <= arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    // Find peak/max element index in a rotated sorted array
    static int peakinRotated(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Search in rotated sorted array without duplicates
    static int searchInRotatedArr(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (target == arr[mid]) {
                return mid;
            }

            // Left half is sorted
            if (arr[start] <= arr[mid]) {

                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } 
            // Right half is sorted
            else {

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    // Search in rotated sorted array with duplicates
    static boolean searchInRotatedArr2(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return true;
            }

            // Duplicate ambiguity
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } 
            // Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] arr2 = {5, 7, 8, 9, 10, 11, 1, 3};

        System.out.println("Binary Search: "
                + binarySearch(arr, 3));

        System.out.println("Mountain Peak Index: "
                + mountain(arr1));

        System.out.println("Rotated Array Peak Index: "
                + peakinRotated(arr2));

        System.out.println("Search in Rotated Array: "
                + searchInRotatedArr(arr2, 10));

        System.out.println("Search in Rotated Array with Duplicates: "
                + searchInRotatedArr2(arr2, 10));
    }
}