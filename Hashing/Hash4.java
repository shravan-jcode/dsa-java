
package Hashing;

class Hash3 {

    public void countFreq(String str) {

        int n = str.length();

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip if already processed
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " -> " + count);
        }
    }

    public static void main(String[] args) {

        String str = "abacba";

        Hash3 sol = new Hash3();

        sol.countFreq(str);
    }
}
