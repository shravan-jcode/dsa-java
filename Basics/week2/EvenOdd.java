package week2;

import java.util.Scanner;

public class EvenOdd {

public static void evenOdd(int num){
    if(num%2==0){
        System.out.println(num+" Even");
    }
    else{
        System.out.println(num+" Odd");
    }
}
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter num: ");
        int num =sc.nextInt();
        

        evenOdd(num);

    }
    
}
