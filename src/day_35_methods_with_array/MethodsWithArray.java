package day_35_methods_with_array;

public class MethodsWithArray {
    public static void main(String[] args) {
        int[] myNums={3,1,4,55,6,9,3};
        printArray(myNums);
        printArray(new int[]{5,6,7,8,89,9});
        System.out.println();
        System.out.println(has10(new int[]{4, 5, 6}));
        System.out.println(has10(new int[]{10, 10, 10,}));
        System.out.println(longerThan3(new int[]{4, 5}));
        System.out.println(longerThan3(new int[]{4, 5, 6, 7, 8, 9}));
        System.out.println(longerThan3(new double[]{2.3, 3.0, 5.4}));

    }
    public static void printArray(int[] nums){
        for(int eachNum:nums){
            System.out.print(eachNum+"\t");
        }
    }
    public static boolean has10(int[]numbers){
        boolean found=false;
       for(int i=0;i<numbers.length;i++){
           if (numbers[i]==10){
               found=true;
               break;
           }
       }
        return found;
    }
    public static boolean longerThan3(int[] nums){
        boolean yes=false;
        if(nums.length>3){
            yes=true;
        } else{
            yes=false;
        }
        return yes;
    } public static boolean longerThan3(double[]nums){
        return nums.length>3;
    }
}
