package LinearSearch;

public class One {
    public static void main(String[] args) {

        // array linear Search
        int[] arr = { 10, 20, 30, 40, 50 };

        int ans = linearSearch(arr, 30);

        System.out.println(ans);

        // String linear Search
        String name = "kunal";
        char target = 'u';
        System.out.println(search(name, target));

        // range
        System.out.println(range(arr, 2, arr.length - 1, 40));

        // min
        min(arr);

        // search 2darray
        int[][] arr2d = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        search2d(arr2d, 3);
    }

    // array search
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];

            if (element == target) {
                return i;
            }
        }

        return -1; // target not found
    }

    // String search
    static boolean search(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                System.out.println(target + " found at " + i);
                return true;
            }
        }

        // for (char ch: str.toCharArray()) {
        // if(ch==target){
        // return true;
        // }
        // }

        return false;
    }

    // range code
    static int range(int arr[], int start, int end, int target) {

        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                System.out.println(target + " found at " + i);
                return i;
            }
        }
        return -1;
    }

    // min max

    static void min(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min: " + min + " max: " + max);

    }

    static void search2d(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println(target + " found at " + i + j);
                    return ;
                }
            }
        }
    }

}