package Recurssion;

public class Recursion3 {

    int count = 0;
    int add = 0;

    // functional
    int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    // paramaterize
    void sum(int i, int sum) {
        if (i == 0) {
            System.out.println("Sum = " + sum);
            return;
        }

        sum(i - 1, sum + i);
    }


    public static void main(String[] args) {
        Recursion3 rec = new Recursion3();

        int ans = rec.sum(5);
        System.out.println("Sum = " + ans);

        rec.sum(5, 0);

    }
}
