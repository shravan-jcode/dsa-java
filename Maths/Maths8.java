package Maths;

public class Maths8 {
    public static void main(String[] args) {
        
        int number =123457;
        int max=0;

        while (number >0) {
            int ld =number % 10;

            if(ld>max){
                max=ld;
            }

            number = number / 10;
        }
        System.out.println("max number: "+max);
    }

}

