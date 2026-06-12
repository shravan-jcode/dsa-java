package week4;

public class ProductofDigit {
    public static void main(String[] args) {
        int number =222;

        int prod=1;
        while (number>0) {
            int ld =number %10;
        prod *=ld;
        number =number/10;
    
        }
        System.out.println(prod);
    }
    
}
