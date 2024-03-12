package day_61_collection_3;
import java.util.*;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //   KEY    VALUE
        HashMap<String,Double> items=new HashMap<>();
        Map<String,Double>myMap=new HashMap<>();
        myMap.put("Banana",0.89);
        myMap.put("Apple",5.99);
        myMap.put("Egg",3.99);
        myMap.put("Milk",4.99);
        myMap.put("Strawberry",6.99);
        myMap.put("Carrot",1.99);
        System.out.println(myMap.size());
        System.out.println(myMap.toString());
        System.out.println("Price of Eggs: "+myMap.get("Egg")+"$");
        System.out.println("Price of Banana: "+myMap.get("Banana")+"$");
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
        for(String MiniiYumnuud: myMap.keySet()){
            System.out.println(MiniiYumnuud);
            System.out.println(myMap.get(MiniiYumnuud));
        }
        System.out.println(myMap.containsKey("Egg"));



    }
}
