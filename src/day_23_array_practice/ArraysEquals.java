package day_23_array_practice;
import java.util.*;
import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        //Arrays.equals------->>
        //compares if 2 arrays are equal.
        //checks if 2 arrays have same length and same data in each index.

        int[] yourArray={2,4,7};
        int[] myArray={2,4,7,9};
        int[] num3={85,6,7,8,9};
        int[] num4={85,6,7,8,9};
        int[] num5={85,6,7,8,9};
        int[] num36={85,6,7,8,9};
       System.out.println( Arrays.equals(num5,num36));
        System.out.println(Arrays.equals(yourArray,myArray));
        System.out.println((num5==num36));//---->>it is not pointing same object
        String []cars1={"tesla, toyato,honda,BMW"};
        String [] cars2={"tesla, toyato,honda,BMW"};
        String [] cars3={"tesla, toyato,honda,bmw"};
        String [] cars4={"tesla, toyato,honda"};
        System.out.println(Arrays.toString(cars1));
        System.out.println(Arrays.equals(cars1,cars3));
    boolean equal=Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars1));
        System.out.println(equal);

    }
}
