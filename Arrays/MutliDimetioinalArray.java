package Arrays;

public class MutliDimetioinalArray {
    public static void main(String args[]){

        //2d Array
        System.out.println("2D Array");
        int num[][] =new int [3][4];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //enhanced array
        for (int[] n : num) {
            for(int a:n){
                System.out.print(a+" ");
            }
            System.out.println();
            
        }


        //jagged Array
           System.out.println();
        System.out.println("Jageed Array");
        int[][] jaggedArr =new int[3][];
        jaggedArr[0]=new int[2];
        jaggedArr[1]=new int[1];
        jaggedArr[2]=new int[3];

        for(int i=0;i<jaggedArr.length;i++){
            for (int j=0;j<jaggedArr[i].length;j++){
                jaggedArr[i][j]=(int)(Math.random()*10);
            }
        }

     
        for (int[] jg : jaggedArr) {
            for (int a : jg) {
                System.out.print(a);
                
            }
            System.out.println();
        }

        //3D Array
        System.out.println();
        System.out.println("3D Array");
        int[][][] threeD =new int [2][3][4];

        for(int i=0;i<threeD.length;i++){
            for(int j=0;j<threeD[i].length;j++){
                for(int k=0;k<threeD[i][j].length;k++){
                    threeD[i][j][k]=(int)(Math.random()*10);
                }
            }
        }

        for (int[][] layer : threeD) {
            for (int[] row : layer) {
                for (int x  : row) {
                    System.out.print(x +" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        
    }
}
