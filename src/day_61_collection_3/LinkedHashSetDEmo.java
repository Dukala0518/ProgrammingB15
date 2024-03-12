package day_61_collection_3;
import java.util.*;
public class LinkedHashSetDEmo {
    public static void main(String[] args) {
        Set<String>set=new LinkedHashSet<>();
        set.add("Bill");
        set.add("Erdemt");
        set.add("Enkhrii");
        set.add("Dukala");
        System.out.println(set.size());
        System.out.println(set.toString());
        set.remove("Dukala");
        System.out.println(set.toString());
        set.forEach(each-> System.out.println(each));
    }
}
