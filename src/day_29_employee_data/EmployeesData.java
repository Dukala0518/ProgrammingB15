package day_29_employee_data;

import java.sql.Array;
import java.util.Arrays;

public class EmployeesData {
    public static void main(String[] args) {
        String data="Dulamsuren Begzsuren [SDET] dukala0518@google.com";

        //How to extract job position from above string

        //find the index of "[" and store into variables.
        //find the index of "]" and store into variables.
        int index1=data.indexOf("[");
        int index2=data.indexOf("]");
        String jobTitle=data.substring(index1+1,index2);
        System.out.println(jobTitle);

        //TASK1: rewrite the above code into single statement
        System.out.println(data.substring(data.indexOf("[")+1,data.indexOf("]")));

        //TASK2: extract first name and last name and assign to variables.

        String datas="Dulamsuren Begzsuren [SDET] dukala0518@google.com";
        //How to look for second space
        //indexOf("char")    indexOf( start,"char")
        String firstName=datas.substring(0,datas.indexOf(" "));
        System.out.println(firstName);
        String lastName=datas.substring(datas.indexOf(" ")+1,datas.indexOf(" ["));
        System.out.println(lastName);
       int end= datas.indexOf(" ",datas.indexOf(" ")+1);  //Ask Bill!
        System.out.println(end);
String LASTNAME=datas.substring(datas.indexOf(" ")+1,end);
        System.out.println(LASTNAME);

        //TASK3 :Extract f l name

        String[] datasArr=datas.split(" ");
        System.out.println(datasArr.length);
        String firstNames=datasArr[0];
        String lastNames=datasArr[1];
        System.out.println(firstNames+" "+lastNames);

        String First= datas.split(" ")[0];
        String Last=datas.split(" ")[1];
        System.out.println(First+" "+Last);
        System.out.println(datas.split(" ")[3]);















    }
}
