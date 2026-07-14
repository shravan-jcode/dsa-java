package Hashing;

class Hash2 {
    // Function to count frequency of each element in the array
    public void countFreq(int[] arr, int n) {
        // Create a visited array to mark elements that are already processed
        boolean[] visited = new boolean[n];

        // Traverse through all elements of the array
        for (int i = 0; i < n; i++) {
            // Skip this element if it's already processed
            if (visited[i])
                continue;

            // Count the frequency of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark arr[j] as processed
                    count++;
                }
            }

            // Output the element and its count
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        // Create Solution instance
        Hash2 sol = new Hash2();

        // Call the function to count frequencies
        sol.countFreq(arr, n);
    }
}