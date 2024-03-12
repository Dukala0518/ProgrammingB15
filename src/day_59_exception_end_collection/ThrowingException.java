package day_59_exception_end_collection;

import java.io.IOException;

public class ThrowingException {
    public static void main(String[] args) {

        //create object of ArithmeticException
        ArithmeticException ar = new ArithmeticException();
        RuntimeException ar2 = new ArithmeticException("cannot/ by 0");
        System.out.println(ar.getMessage());
        System.out.println(ar2.getMessage());

        // throw ar;
        String userName = "bkbi";
        if (userName.isEmpty()) {
            throw new RuntimeException("username cannot be empty");
        } else {
            System.out.print("user name is valid");
        }

        int age = 20;
        //age=17;
        if (age > 18) {
            System.out.println("eligible to vote");
        } else {
            throw new IllegalArgumentException("ineligible to vote");
        }
        int month = 2;
        //month=0;
        if (month < 1 || month > 12) {
            throw new RuntimeException();
        } else {
            System.out.println("right input");
        }
        int[] numbers = {9, 5, 10, 4};
        int index = 1;
        if (index < 0 || index > numbers.length) {
            throw new ArrayIndexOutOfBoundsException("invalid index");
        } else {
            System.out.println(index + "value: " + numbers[index]);

        }
        String firstName = "Erdemt";
        if (firstName.isBlank()) {
            throw new NullPointerException("First name can not be empty");
        }
        for (int i = 0; i < firstName.length(); i++) {
            System.out.print(firstName.charAt(i));
        }
        System.out.println();
        try {
            throw new IOException("IOEXCEPTION");
        } catch (Exception E) {
            System.out.println("Exception caught");

        }
    }
    public static String getWeekDayName(int day) {
        if(day<1|| day>7){
            throw new RuntimeException("Invalid input: "+day);
        }
        String dayName="";
        switch (day){
            case 1:
                dayName="Mon";
                break;
            case 2:
                dayName="Tue";
                break;
            case 3:
                dayName="Wed";
                break;
            case 4:
                dayName="Thu";
                break;
            case 5:
                dayName="Fri";
                break;
            case 6:
                dayName="Sat";
                break;
            case 7:
                dayName="Sun";
                break;
        }
        return dayName;

    }



}