package day_61_collection_3;
import java .util.*;
public class TreeSetDEmo {
    public static void main(String[] args) {
        TreeSet<Double>treeSet=new TreeSet<>();
        SortedSet<Double>myTreeSet=new TreeSet<>();
        myTreeSet.add(789.0);
        myTreeSet.add(789.0);
        myTreeSet.add(99.99);
        myTreeSet.add(89.00);
        myTreeSet.add(2500.89);
        System.out.println(myTreeSet.size());
        System.out.println(myTreeSet.toString());


    }
}
