package day_61_collection_3;
import java.util.*;
import day_60_collections_2.Product;
public class HashSetOfProduct {
    public static void main(String[] args) {
        /*
        When we create set of custom class object, hashset class does not
        know which one is duplicate or unique.
        We need to teach HashSet how to compare object from our custom class.
        TO DO:
         1. override equals() method
         2. override hashCode() method
         Once we do above two steps then Hashset will call those 2 methods to
         compare object from our custom class.Then it knows which one is unique and duplicate.

         equals() and hashCode() methods are inherited from our custom class.
         By default, equals()  method does not compare data unless we override it from
         Object class.


        */
        Set<Product>prodSet=new HashSet<>();
        prodSet.add(new Product("Underwear",12.99));
        prodSet.add(new Product("shirt",8.00));
        prodSet.add(new Product("strawberry",6.99));
        System.out.println(prodSet.size());
        System.out.println(prodSet.toString());


    }
}
