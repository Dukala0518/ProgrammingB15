package day_37_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<String>shoppingList=new ArrayList<>();
        System.out.println("isEmpty: "+shoppingList.isEmpty());
        shoppingList.add("LV");
        shoppingList.add("Gucci");
        shoppingList.add("Prada");
        shoppingList.add("Chanel");
        shoppingList.add("Burberry");
        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }
        //GET COUNT AND ASSIGN VARIABLE COUNT.
        int count=shoppingList.size();
        System.out.println("Count of items to buy "+ count);
        //check if"jacket" is among the items.
        if(shoppingList.contains("LV")){
            System.out.println("There is LV");
        }else{
            System.out.println("There is no LV");
        }
        System.out.println("LV index "+shoppingList.indexOf("LV"));



    }

    public static class day_38_ArrayListContinue {
        public static class ArrayListCustomMethod {
            public static void main(String[] args) {
                //Can we use ArrayList in our custom method?
                //method with one String
                //public static void printList(String List){}

                //method with String array
                //public static void PrintList(String[] list){}

                //method with String arrayList
                //public static void String printList(ArrayList<String>list){} or
                //public static void String printList(List<String>list){}
                //method return
                //public static ArrayList<String> myMethod(){};
                //ArrayList<String> list=new ArrayList<>();
                //list.add("one");
                //list.add("two");
                //return list;

                //method that accepts (param/args) one String ArrayLIst and Integer ArrayList and return boolean
                //public static boolean myMethod(ArrayList<String>a, ArrayList<Integer>b){
                // return true}

                //method with Integer ArrayList and returns String ArrayList
                //public static ArrayList<String> myMethod(ArrayList<Integer>list){
                //ArrayList<Integer> list =new ArrayList<>()
                //list.add(12);
                //return list;









            }
        }

        public static class ArrayAsListMethod {
            public static void main(String[] args) {
                //Array.asList method-->Declare and add values in single statement.
                List<Integer> nums= Arrays.asList(12,12,3,5,68);//you can not remove it you can add it.it comes with price
               // nums.add(67);
               // nums.add(0); you can not add.
                System.out.println(nums);
                List<Integer>nums2= new ArrayList(Arrays.asList(12,12,3,5,68));
                nums2.add(30);
                System.out.println(nums2);
                nums2.remove(0);
                nums2.remove(Integer.valueOf(12));
                System.out.println(nums2);
                System.out.println("****************");
                //How do you sort Array?Do you remember--> Array.sort(arr).
                //Then how do you sort ArrayList?-->Collections.sort(list)


            }
        }
    }
}
