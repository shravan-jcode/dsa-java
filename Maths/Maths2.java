package Maths;

public class Maths2 {

    public static void main(String[] args) {
        
        int num=121;
        int dummy=121;
        int revnum=0;

        while (dummy>0) {
            int lastDigit = dummy %10;
            revnum =(revnum*10)+lastDigit;
            dummy =dummy/10;
        }

        if(num==revnum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindromee");
        }
        System.out.println(revnum);
    }
    
}