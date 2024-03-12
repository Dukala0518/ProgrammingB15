package day_60_collections_2;
import java.util.*;
public class IteratingCollection {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Bill");
        list.add("Duka");
        list.add("Eddie");
        list.add("Amy");
        for(String str:list){
            System.out.print(str+",");
           // list.remove(str);
            System.out.println();
        }
        //Iterator interface can be used to iterator
        //Declaring Iterator variable and assigning our list
        Iterator<String>it= list.iterator();
      //  System.out.println(it.hasNext());
      //  System.out.println(it.next());
      //  System.out.println(it.next());
       // System.out.println(it.next());
       // System.out.println(it.next());
       // System.out.println(it.hasNext());
        System.out.println("--------");
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        //System.out.println(it.next());
        System.out.println(list.toString());













    }
    }

