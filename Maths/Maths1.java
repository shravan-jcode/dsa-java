package Maths;

public class Maths1 {
    public static void main(String[] args) {


        // Count all Digits of a Number
        int number = 1234;
        int count = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            count++;

            number = number / 10;   // Remove last digit
        }

        System.out.println(count);
    }
}


//        123            
//     _______
// 10  )  1234
//      - 10
//        ----
//         23
//       - 20
//         ----
//          34
//        - 30
//          ----
//           4