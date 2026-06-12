package week2;

import java.util.Scanner;

public class PositiveNegative {
    public static void posNeg(int num){
        if(num>0){
            System.out.println(num+" Positve");
        }
        else{
            System.out.println(num+" Neagative");
        }

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num: ");
        int num =sc.nextInt();
        posNeg(num);

    }
    
}
