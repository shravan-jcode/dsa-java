package Recurssion;

public class Recursion4 {

    //Reverse Array using One Pointer (Recursion)
    void reverse(int[] arr, int index){
        if(index >= arr.length/2){
            return ;
        }

        int temp  = arr[index];
        arr[index] =arr[arr.length - index -1];
        arr[arr.length-index-1] =temp;

        reverse(arr, index+1);
    }
    
    
    //Reverse Array using Two Pointers (Recursion)
    void reverse (int[] arr, int left,int right){
        if(left >=right){
            return;
        }

        int temp =arr[left];
        arr[left]=arr[right];
        arr[right] =temp;

        reverse(arr, left+1,right-1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        Recursion4 rec =new Recursion4();
        
        rec.reverse(arr, 0);
        rec.reverse(arr,0,arr.length-1);

        for(int num:arr){
            System.out.println(num +" ");
        }
    }
}