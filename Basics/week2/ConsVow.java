package week2;

public class ConsVow {

    public static void alphabetType(char ch){
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        System.out.println("Vowel");
       }
       else{
        System.out.println("consonent");
       }
    }
    public static void main(String[] args) {
        alphabetType('t');
        
    }
    
}
