package day_37_arraylist;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();
        cities.add(0,"Brentwood");
        cities.set(0,"Ulaangom");
        cities.add("Mclean");
        cities.add("Ulaangom");
        cities.add("Ulaanbaatar");
        cities.add(0,"Brentwood");
        cities.add(0,"Brentwood");
        cities.add(cities.size(), "Nashville");
        cities.set(0,"Ulaangom");
        cities.set(0,"Nashville");
       // System.out.println(cities);
        cities.remove(3);
        cities.remove("Brentwood");
        System.out.println(cities);
        cities.remove("new york");
        System.out.println(cities);
        System.out.println("Cities count:"+cities.size());




    }
}
