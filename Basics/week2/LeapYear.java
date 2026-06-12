package week2;

public class LeapYear {

    public static void leapYear(int year){
        if(year%400==0|| year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not leap year");
        }

    }
    public static void main(String[] args) {
        leapYear(2024);
        
    }
    
}
