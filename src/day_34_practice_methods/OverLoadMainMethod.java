package day_34_practice_methods;

import java.util.Arrays;
import java.util.EnumSet;

public class OverLoadMainMethod {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        main(10);
        sum(2,3,56,7,8,90);
        System.out.println(sum(5,6,7,8));
    }
//overloading main method
    //same name
    //different parameter
    //But this new main method, is not what java looks for when starting code execution.
    public static void main(int num) {
        System.out.println(num);
        // *******VAR-ARGS----->>Variable arguments/parameters
        //When we create method with var-args (...),it means we can pass any number of inputs of that type of that method.
    }
    public static int sum(int ...num){
        System.out.println(Arrays.toString(num
        ));
        return num[1];

    }
}
