package BinarySearch;

public class InfiniteArray {
    
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;

        while (target>arr[end]){
            int newStart =end+1;
            end =end+(end-start+1)*2;
            start=newStart;
        }
        return binarySerch(arr,target,start,end);
    }

    static int binarySerch(int[] arr, int target,int start, int end ){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start =mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 9, 10, 15, 18, 22, 27, 35, 40, 50, 60, 70};
        int target = 35;

        System.out.println(ans(arr, target));
    }
}
