package day_37_arraylist;
import java.util.*;
public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(100,23,56,78,34,56,78,90));
        System.out.println("Before sorting= "+nums);
        Collections.sort(nums);
        System.out.println("After sorting="+nums);
        Collections.reverse(nums);
        System.out.println("Reversed= "+nums);
        List<Character>charList=new ArrayList<>(Arrays.asList('d','u','k','a'));
        Collections.sort(charList);
        System.out.println(charList);

        //How to convert array to arrayList?
        //I CAN USE Arrays.asList method
        int num[]={1,2,3,4,5};
        List<Integer>list=Arrays.asList(1,2,3,4,5);
        //How to arrayList to array?
       //I can use toArray method of arraylist.
       // Object[]arr=list.toArray();
        //list.toArray();-->is used to convert from ArrayList to an array.
        //But it returns Object[] array,not an Integer.
        //Integer[]arr=list.toArray(new Integer[0]);



    }

    public static class MethodsWithArrayList {
    }
}
