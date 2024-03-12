package day_62_collection_4;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        //declare raw hashmap
        Map<Object, Object> rawmap=new HashMap<>();
        rawmap.put(123,674);
        rawmap.put(true,false);
        rawmap.put("key","value");
        rawmap.put("potatoes",7.0);
        System.out.println(rawmap);
        //declare polymorphic Map
        Map<Integer,String>employees=new HashMap<>();
        HashMap<Integer,List<String>> empMap=new HashMap<>();
        List<Map<Integer,String>>list=new ArrayList<>();
        employees.put(10,"Bilguun");
        employees.put(20,"Dukala");
        employees.put(30,"Erdemt");
        employees.put(4,"Enkhrii");
        employees.put(5,"Bombogo");
        employees.put(6,"Ariuka");
        System.out.println(employees.get(6));
        employees.replace(6,"Ariuka","Somebody");
        employees.replace(4,"Bilguun");
        System.out.println(employees);
        employees.put(10,"new person");
        System.out.println(employees.containsKey(5));
        System.out.println(employees.containsValue("Dukala"));
        Set<Integer>mine=employees.keySet();
        System.out.println(mine);
        System.out.println(employees.values());
      Collection<String>miniiValue=employees.values();
        System.out.println(miniiValue);




    }
}
