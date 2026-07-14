package Recurssion ;
public class Recursion1 {
    int count=0;

    // void rec(){
    //     if(count==4){
    //         return ;
    //     }
    //     count ++;
    //     System.out.println(count);
    //     rec();
    // }

    int rec(){
        if(count==4){
            return 0;
        }
        count++;
        System.out.println(count);
        return rec();
    }

    public static void main(String[] args) {
        Recursion1 d=new Recursion1();
       d.rec();
    }
}