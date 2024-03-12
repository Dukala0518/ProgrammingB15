package day_38_methods_with_array_list;
import java.util.*;
public class methodsReturnArrayList {
    public static void main(String[] args) {
        //call getMonths() and print out returned list
        System.out.println(getMonths());
        //call getMethods() and assign returned list another list then print
        List<String>allMonthInYear=getMonths();
        System.out.println(allMonthInYear);
        for(String eachMonth:allMonthInYear){
            System.out.println(eachMonth);
        }
        System.out.println(getIntList(10));
        System.out.println(getIntRandomList(8));
    }
    //method:getMonths param:none,return ArrayList <String>
    public static List<String> getMonths(){
        List<String> allMonth= new ArrayList<>();
        allMonth.add("Jan");
        allMonth.add("Feb");
        allMonth.add("Mar");
        allMonth.add("Apr");
        allMonth.add("May");
        allMonth.add("Jan");
        allMonth.add("Jun");
        allMonth.add("Aug");
        allMonth.add("Sep");
        allMonth.add("Oct");
        allMonth.add("Nov");
        allMonth.add("Dec");
        return allMonth;
    }
    //method:getIntList param:int size return:ArrayList<Integer>;
    //it creates list of integers from 1 until size
    public static List<Integer>getIntList(int n){
        List<Integer>all=new ArrayList<>();
            for(int i=1;i<=n;i++){
              all.add(i);
            }
        return all;
    }
    public static List<Integer>getIntRandomList(int n){
        List<Integer>random=new ArrayList<>();
        Random r=new Random();
        for(int i=1;i<=n;i++){
            random.add(r.nextInt(10));
        }
        return random;


    }}
