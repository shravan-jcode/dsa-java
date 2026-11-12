package Hashing;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args){
        int[] arr ={1,2,3,1,2,1,5};


        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i =0;i<arr.length;i++){
            int num =arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }

        
    }
}
