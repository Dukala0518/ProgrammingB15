package day_24_array_practice;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        //NOTE:
        //This method: //Arrays.toString(num);
                       //Arrays.sort
                       //Arrays.equals
        //helps us reads all the values from the value and formats separated by coma re
        //returns as a String
        //useful when we want to print all array values without using a loop.
        double[] num = {99.99, 76.9, 89, 100, 89.5};
        Arrays.toString(num);
        System.out.println(Arrays.toString(num));
        String[] fruit = {"mangoes", "kiwis,apples"};

        System.out.println(Arrays.toString(fruit));

        char[]name={'D','U','l','A','M','S','U','R','E','N'};
        System.out.println(Arrays.toString(name).toLowerCase());

        String [] arrayDays= { "Mon,Tue,Wed,Thur,Fri,Sat,Sun"};
        System.out.println(Arrays.toString(arrayDays));



    }}