package Maths;

public class Maths7 {
    
    public static void main(String[] args) {
        int number  =1234;
        int rev =0;

        while (number>0) {
            int ld = number % 10;
            rev =rev * 10 +ld;

            number = number / 10;
        }

        System.out.println(rev);
    }
}
