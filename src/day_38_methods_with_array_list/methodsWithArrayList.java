package day_38_methods_with_array_list;
import java.util.*;
public class methodsWithArrayList {
    public static void main(String[] args) {
       List<Integer>nums=new ArrayList<>();
        nums.add(1);  nums.add(2);nums.add(3);nums.add(4);nums.add(5);
       printList(nums);
       List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        doubleTheList(numbers);
        System.out.println("Before doubling "+numbers.toString());
        doubleTheList(numbers);
        System.out.println("After doubling "+numbers.toString());
        System.out.println("Nums before doubling "+nums);
        doubleTheList(nums);
        System.out.println("After doubling "+nums);
        List<Integer>total=new ArrayList<>();
        total.add(1992);
        total.add(1992);
        total.add(2020);
        total.add(2022);
        System.out.println(sumList(total));
        System.out.println(sumList(numbers));
        System.out.println(sumList(nums));
    }
    //method:printList, Parameter List<Integer>list, Return void
    //print each value in same line separated by space
    public static void printList(List<Integer>list){
        for(int i=0;i< list.size();i++){
            if(i==list.size()-1){
                System.out.println(list.get(i));
            }else{System.out.print(list.get(i)+" | ");
            }
        }
        System.out.println();
    }
    //method:doubleTheList, param:List<Integer>nums Return:void,
    public static void doubleTheList(List<Integer>nums){
        for (int i=0;i< nums.size();i++){
            int tem=nums.get(i);
            nums.set(i,tem*2);
        }
    }
    //method:sumList, param:List<Integer>nums1: return:int sums each number and return
    public static int sumList(List<Integer>nums1){
        int total=0;
        for(int i=0; i<nums1.size();i++){
            total=total+nums1.get(i);
        }
        return total;
    }

}
