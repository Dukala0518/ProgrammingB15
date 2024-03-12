package day_59_exception_end_collection.collcetion_intro;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        //declaring and instantiation of arrayList
        ArrayList<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        Collection<Integer>list3=new ArrayList<>();
        Iterable<Integer>list4=new ArrayList<>();//try avoid
        list1.add(9);
        list1.add(10);
        list1.add(4);
        list1.add(5);
        System.out.println(list1.toString());

    }
}
