package day_59_exception_end_collection.collcetion_intro;
import java.util.*;
public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>linkedList1=new LinkedList<>();
        List<String>linkedList2=new LinkedList<>();

        linkedList1.add("Bilguun");
        linkedList1.add("Dulamsuren");
        linkedList1.add("Erdemt");
        linkedList1.add("Enkhrii");
        linkedList1.addFirst("Bilguun");
        linkedList1.addLast("Enkhrii");
        System.out.println(linkedList1.get(0));
        System.out.println(linkedList1.getFirst());
        System.out.println(linkedList1.getLast());
        /*
        ArrayList and LinkedList difference?
        ArrayList internally uses dynamic arrays.
        LinkedList uses Node objects that refer to each other.
        Both of them implement List interface
        ArrayList-- Adding and removing is slower, because it needs to manipulate and copy
        array.
        LinkedList--Adding and removing is faster, pop in a new node or pop out
        a node is fast



        */


    }
}
