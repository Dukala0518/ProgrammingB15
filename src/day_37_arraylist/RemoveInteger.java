package day_37_arraylist;
import java.util.ArrayList;
public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(33);
        nums.add(5);
        nums.add(33);
        nums.add(3);
        nums.add(3);
        nums.add(5);
        nums.add(33);
        nums.add(3);
        System.out.println(nums.size());
        //REMOVE NUMBER FROM INDEX 0;
        nums.remove(0);
        System.out.println(nums);
        //REMOVE NUMBER 2 AND PRINT
      nums.remove(Integer.valueOf(3));
        System.out.println(nums);
        nums.remove(Integer.valueOf(5));
        System.out.println(nums);
        //CONTAINS METHOD
        System.out.println(nums.contains(10));
        System.out.println(nums.isEmpty());
        System.out.println(nums.indexOf(3));





    }
}
