package Maths;

public class Maths6 {
    
    public static void main(String[] args) {
        
        int number =123457;
        int count=0;

        while (number >0) {
            int ld =number % 10;

            if(ld % 2 !=0)count++;

            number = number / 10;
        }
        System.out.println("number of odds: "+count);
    }
}
