package Hashing;

public class Main {
    public static void main(String[] args) {
        int arr[] ={1,2,3,1,2,5,1,2};

        int hash[] =new int[6];

        for(int i=0; i<arr.length;i++){
            hash[arr[i]]++;
        }

        int [] queries={1,2,3,5,4};

        for(int i=0;i<queries.length;i++){
            System.out.println(
                queries[i]+" occurs: "+ hash[queries[i]]+" times "
            );
        }
    }
}
