class Computer {
    
    public void playMusic(){
        System.out.println("Music Playing....");
    }

    public String giveMePen(int cost){
        if(cost>=10){
            return "Take these Pen";
        }
        return "Nothing";

    }
    
}

public class Demo {

     void greet() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Computer comp =new Computer();

        comp.playMusic();
        String result = comp.giveMePen(10);
        System.out.println(result);

        Demo d =new Demo();

        d.greet();
    }
}
