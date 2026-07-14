package Hashing;


public class Hash1 {

    public static void main(String[] args) {
        int[] arr ={1,2,1,3,2,1};

        int [] hash =new int[4];

        
        for(int i=0;i<arr.length; i++){
            hash[arr[i]]++;
        }

        for(int i =1;i<hash.length;i++){
            System.out.println(i+" -> "+hash[i]);
        }
    }
}