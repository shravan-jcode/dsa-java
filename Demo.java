public class Demo {

    public  static void pattern1(int n) {
        for(int row=0;row<n;row++){
            for(int col =1;col<=n -row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       

        // int n =5;
        // for(int i=1;i<=n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=n-1; i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int[] arr = new int[5];
        arr[1]=5;
        System.out.println(arr.length);

    }
}
