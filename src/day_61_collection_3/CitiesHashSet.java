package day_61_collection_3;
import java.util.*;
public class CitiesHashSet {
    public static void main(String[] args) {
        Set<City>citySets=new HashSet<>();
        //cities.add(new City("Ulaanbaatar"));
       City c1=new City("Ulaanbaatar");
       City c2= new City("Ulaangom");
       City c3=new City("Jargalant");
       City c4=new City("Ulaanbaatar");
       citySets.add(c1);
        citySets.add(c2);
        citySets.add(c3);
        citySets.add(c4);

        System.out.println(citySets.size());
        System.out.println(citySets.toString());



    }

}
