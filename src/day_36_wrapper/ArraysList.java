package day_36_wrapper;
import java.util.ArrayList;
public class ArraysList {
    public static void main(String[] args) {
        //before Arraylist lets talk about Array
        //what is Array?
        //Arrays-is multiple values of some type in one collection.
        //there are some limitations for arrays in java.--it is fixed length.

        //***********What is ArrayList???***********
        //ArrayList is a class.Like String or Scanner
        //ArrayList class comes with java(jdk) and is part of Collections Framework.
        //What is the purpose of ArrayList and all other collections?
        //work with multiple sets of data efficiently.
        //We need to import it from java.util.ArrayList package
        //It is Array Based-Internally it used arrays for all operations.it is resizeable.
        // . some people call ot -DYNAMIC ARRAY
        //ArrayList cannot store primitives?
        //How to declare and use it?
        //declare ArrayList
        //we can declare ArrayList that can hold any object.
        //Mix of String, Integer, etc...But mixing is not good idea.
        ArrayList myFirstList=new ArrayList();
        //assign values using and add methods
        myFirstList.add("java");
        myFirstList.add("javascript");
        myFirstList.add("python");
        myFirstList.add("repl.it");
        myFirstList.add(1200);
        myFirstList.add(99.19);
        myFirstList.add(true);
        myFirstList.add('a');
        System.out.println(myFirstList);

        //Declare ArrayList with a specified data type.
        ArrayList<Integer>numsList=new ArrayList<>();
        numsList.add(12);
        numsList.add(12);
        numsList.add(12);
        System.out.println(numsList);
//Print number of values.
        System.out.println(numsList.size());
        //Print all values in single line using toString method
        System.out.println(numsList.toString());
       // Print first number at index 0.
        System.out.println(numsList.get(0));
        int i=2;
        //print number at index i.
        System.out.println(numsList.get(i));
        for (int n=0;n<numsList.size();n++){
            System.out.println(numsList.get(n));

        }

    }
}
