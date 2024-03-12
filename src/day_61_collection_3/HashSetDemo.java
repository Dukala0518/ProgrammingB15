package day_61_collection_3;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet<Integer> set1=new HashSet<>();
        //polymorphic way
        //Iterable<Integer>set2=new HashSet<>();
        Set<Integer>set3=new HashSet<>();
        set3.add(10);
        set3.add(10);
        set3.add(99);
        set3.add(76);
        System.out.println(set3.toString());
        System.out.println(set3.size());
        System.out.println(set3.contains(10));
        for (int num: set3){
            System.out.println(num);
            break;
        }

        Iterator<Integer>itSet=set3.iterator();
        while(itSet.hasNext()){
            System.out.println(itSet.next());
        }




    }
}
