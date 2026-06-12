package Arrays;

import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        Scanner sc = new Scanner(System.in);

        // 1. Traversing Array
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 2. Sum of Elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);

        // 3. Largest and Smallest Element
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Largest Element = " + max);
        System.out.println("Smallest Element = " + min);

        // 4. Linear Search
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        // 5. Enhanced For Loop
        System.out.println("Using Enhanced For Loop:");

        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }
}


// Day 01: Learned Array Basics in Java

// - Array declaration and initialization
// - Array traversal
// - Sum of array elements
// - Finding max and min element
// - Linear search
// - Enhanced for loop