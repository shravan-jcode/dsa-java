/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
   
        int arr[] ={5,4,3,2,1};
        int n=arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[--j]>arr[j]){
                    int temp=arr[--j];
                    arr[--j]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    
    System.out.println(arr);
    }

}