package ArrayListt;

import java.util.ArrayList;

/**
 * ArrayList1
 */
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> fruits =new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);
        System.out.println(fruits.get(0));

        fruits.set(1,"Orange");
        System.out.println(fruits);

        fruits.remove(0);

        System.out.println(fruits);

        System.out.println("Size = " + fruits.size());
    }
}