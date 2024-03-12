package day_37_arraylist;
import java.util.ArrayList;
import java.util.List;

public class ComparisonArrayLists {
    public static void main(String[] args) {
        //******COMPARISON**********
        //******==--> checks if 2 variables are pointing to same object in heap memory.
                //does not compare values. So in arrayList always use equals method.
        //******.equals method--> return true of 2 arrayLists have some length, and
        //same values index by index.
        //****** containsAll method-->
        //list1.containsAll(list2) return true if all values of lists are present in list 2.
        //it is a case-sensitive, but order does not matter.
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(1);
        //list1.add(3);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list1.containsAll(list2));
        System.out.println(list1.equals(list2));
        System.out.println(list2.equals(list1));
        System.out.println(list2.equals(list1));
        System.out.println(list1.containsAll(list2));
        System.out.println("**********************************");

        List<Double>nums1=new ArrayList<>();
        nums1.add(1.2);
        nums1.add(5.2);
        nums1.add(7.5);
        nums1.add(8.0);
        nums1.add(52.5);
        List<Double>nums2=nums1;//refer/point nums2 to same object nums1
        System.out.println(nums2==nums1);
        System.out.println(nums1);
        System.out.println(nums2);
       // nums1.add(100.0);
        System.out.println(nums1);
        System.out.println(nums2);
        List<Double>nums3=new ArrayList<>();
        nums3.add(1.2);
        nums3.add(5.2);
        nums3.add(7.5);
        nums3.add(8.0);
        nums3.add(52.5);
        System.out.println(nums1==nums3);
        System.out.println(nums1.equals(nums3));
        System.out.println(nums1.equals(nums2));
        System.out.println("**************************");
        List<Integer>listA=new ArrayList<>();
        listA.add(30);
        listA.add(10);
        listA.add(11);
        List<Integer>listB=new ArrayList<>();
        listB.add(30);
        listB.add(10);
        System.out.println(listA.equals(listB));
        System.out.println(listA==listB);
        System.out.println(listA.containsAll(listB));
        System.out.println(listA.contains(12));
        System.out.println(listA.contains(listB.indexOf(0)));//ask Bill why it is false.

        System.out.println(listA.removeAll(listB));
        System.out.println(listA);
        System.out.println(listB);
        System.out.println(listB.removeAll(listB));
        System.out.println(listB);


    }

}
