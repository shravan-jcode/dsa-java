import java.util.Scanner;

public class AccessDigit {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter a number");
     int num =sc.nextInt();

     int reverse =0;

     while (num>0) {
        int digit =num%10; //get last digit
        reverse =reverse *10 +digit; //build revrse number
        num =num/10; //remove last digit

     }
     System.out.println("reverse number: "+reverse);
     sc.close();
    }
    
}
