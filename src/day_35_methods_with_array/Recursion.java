package day_35_methods_with_array;

public class Recursion {
    public static void main(String[] args) {
        printNumGood(6);

        /*Method can call another method.
        ***********RECURSIVE METHOD/RECURSION****************
        Also method call itself. (same method)
        In programming recursion can be used to instead of loop or any other purpose.
        If you use recursion, you need to make sure, there is TERMINATE/END situation/condition
        If recursion does not stop ,we get STACKOVERFLOW ERROR
        EX:
         Public static void printNum(int num){
         System.out.println(num);
         printNum(num);
         Whenever a method runs in java, a frame is placed in the stack memory for it.
          Once method completes execution, that frame is removed.
          if method keeps calling itself recursively non-stop, stack eventually gets full,
          then we get STACKOVERFLOW ERROR.

         */
    } // RECURSIVE METHOD WITHOUT END/TERMINATE CONDITION
    public static void printNum(int num){
        System.out.println(num);
        printNum(num);
    }
    // RECURSIVE METHOD WITH END/TERMINATE CONDITION
    public static void printNumGood(int num){
        if(num>=-1){
            System.out.println(num);
            printNumGood(num-1);
        }else{
            return;
        }

    }
}
