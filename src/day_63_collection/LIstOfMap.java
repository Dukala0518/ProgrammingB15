package day_63_collection;
import java.util.*;
public class LIstOfMap {
    public static void main(String[] args) throws Exception {
        /*
        123 Dulamsuren SDET 100.000
        124 Bilguun Developer 250.000

        declare list of map

        */
        List<Map<String,String>> employees=new ArrayList<>();
        Map<String,String>employee1=new HashMap<>();
        employee1.put("employee ID","123");
        employee1.put("employee name","Dulamsuren");
        employee1.put("employee position","SDET");
        employee1.put("employee salary","100000");
        Map<String,String>employee2=new HashMap<>();
        employee2.put("employee ID","124");
        employee2.put("employee name","Bilguun");
        employee2.put("employee position","Developer");
        employee2.put("employee salary","250000");

        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees.toString());
        System.out.println(employees.size());
     //using for each loop, print job title for each employee
        int totalSalary=0;
        for(Map<String,String> each:employees){
            System.out.println(each.get("employee position"));

           totalSalary+=Integer.parseInt(each.get("employee salary"));
        }
        System.out.println(totalSalary);

    }

}
































