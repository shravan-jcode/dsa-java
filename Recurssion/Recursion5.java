package Recurssion;

 class Recursion5 {
    int fib (int n){

        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return fib(n-1) +fib(n-2);
    }
    public static void main(String[] args) {
       Recursion5 rec =new Recursion5();
        
          int n = 7;

        for (int i = 0; i < n; i++) {
            System.out.print(rec.fib(i) + " ");
        }
    }
}
