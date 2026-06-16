package Arrays;

import java.util.Scanner;

public class ThreeD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find: ");
        int num = sc.nextInt();

        boolean found = false;

        // 3D Array: 2 layers, 3 rows, 4 columns
        int[][][] threeD = new int[2][3][4];

        // Fill the array with random numbers (0-9)
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    threeD[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        // Print the array
        System.out.println("\n3D Array:");

        for (int i = 0; i < threeD.length; i++) {
            System.out.println("Layer " + i + ":");

            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        // Search the number
        outer:
        for (int[][] layer : threeD) {
            for (int[] row : layer) {
                for (int x : row) {
                    if (x == num) {
                        found = true;
                        break outer; // Exit all loops
                    }
                }
            }
        }

        //find min max
        int min =threeD[0][0][0];
        int max =threeD[0][0][0];

        for(int[][] layer:threeD){
            for(int[] row :layer ){
                for(int x:row){
                    if(x<min){
                        min=x;
                    }
                    if(x>max
                        
                    ){
                        max=x;
                    }
                }
            }
        }


        // Result
        if (found) {
            System.out.println(num + " exists in the array.");
        } else {
            System.out.println(num + " doesn't exist in the array.");
        }

        System.out.println("Minimum: " +min+ " Maximum: "+max);

        sc.close();
    }
}