package week4;

public class EvenCount {
    public static void main(String[] args) {
        int number =12345;
        int evenNum =0;
        int oddNum =0;

        while (number>0) {
            int ld =number %10;
            if(ld%2==0){
                evenNum +=1;
            }
            else{
                oddNum +=1;
            }
            number =number/10;

        }
        System.out.println("even numbers: "+evenNum);
        System.out.println("odd numbers: "+oddNum);
    }
}
