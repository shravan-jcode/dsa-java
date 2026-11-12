
package Hashing;

class Hash3 {

    // Function to count frequency of each character
    public void countFreq(char[] arr, int n) {

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip if already processed
            if (visited[i])
                continue;

            // Count frequency
            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            // Print character and its frequency
            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};

        int n = arr.length;

        Hash3 sol = new Hash3();

        sol.countFreq(arr, n);
    }
}
