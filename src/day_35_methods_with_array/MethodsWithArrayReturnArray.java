package day_35_methods_with_array;

import java.util.Arrays;

public class MethodsWithArrayReturnArray {
    public static void main(String[] args) {
        //Methods that returns an Array
        //----split
               //str.split(",")----> String[]
        //toCharArray
                //str.toCharArray()--->char[]
        String [] strArr=getDays();
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(getDays()));

    }
    public static String[] getDays(){
        String[] days={"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
        return days;
    }
}

