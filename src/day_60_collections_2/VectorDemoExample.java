package day_60_collections_2;
import java.util.*;
public class VectorDemoExample {
    public static void main(String[] args) {
        Vector<Integer>numbers=new Vector<>();
        List<Integer>numbers2=new Vector<>();
        numbers2.add(22);
        numbers2.add(33);
        numbers2.add(44);
        numbers2.add(55);
        System.out.println(numbers2.toString());
        System.out.println(numbers2.get(3));
        System.out.println(numbers2.size());
        for(int eachNum : numbers2){
            System.out.println(eachNum);
        }




    }

}
