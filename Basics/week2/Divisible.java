package week2;

public class Divisible {

    public static void divisible(int a,int b){
        if(a %b==0){
            System.out.println(a+" is divisible by "+b);
        }else{
                       System.out.println(a+" is not divisible by "+b);

        }
    }
    public static void main(String[] args) {
        divisible(5, 5);
        
        
    }
    
}
