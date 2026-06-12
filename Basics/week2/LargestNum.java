package week2;

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements");

          int max = arr[0];

        for (int i = 0; i < n; i++) {
          
            if (max < arr[i ]) {
                max = arr[i ];
               
            } 

        }
        System.out.println("max: "+max);

    }

}
