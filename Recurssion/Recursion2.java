package Recurssion;

public class Recursion2 {
    int count = 0;

    // print name
    void printName() {
        if (count == 5) {
            return;
        }

        count++;
        System.out.println(count + " Shravan");
        printName();
    }

    // print linearly from 1 to N
    int printNum(int n) {

        if (count == n) {
            return 0;
        }
        count++;
        System.out.println(count);
        return printNum(n);
    }

    // print from N to 1
    int printNto1(int n) {
        if (count == n) {
            return 0;

        }
        System.out.println(n);
        n--;
        return printNto1(n);
    }


 
    // print 1 to N from Backtracking (5,5)
    void backTracking1toN(int i, int n) {
        if (i < 1) {
            return;
        }
        backTracking1toN(i - 1, n);
        System.out.println(i);

    }

    //print N to 1 from backtracking (1,5)
    void backTrackingNto1(int i,int n){
        if(i>n){
            return;
        }
        backTrackingNto1(i+1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        Recursion2 rec = new Recursion2();
        // rec.printName();
        // rec.printNum(10);
        // rec.printNto1(10);
        // rec.backTracking1toN(5, 5);
        rec.backTrackingNto1(1, 5);

    }
}
