package Arrays;

/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};

        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);

        int temp =arr[3];
        arr[3] =arr[4] ;
        arr[4] =temp;
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}