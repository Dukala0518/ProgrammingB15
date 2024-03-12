package day_42_encapsulation_null;

import java.util.ArrayList;

public class Null {
    //instance variables// they are outside of method
    String str; //null
    int numberOfDays;//--->0
    ArrayList<Integer>myList;//--->null

    public static void main(String[] args) {
        int n;
       // System.out.println(n);  COMPILE ERROR NOT INITIALIZED

        String local;//does not get any default value like null
       // System.out.println(local);

      /*null-means a reference variable in the stack does not point to any object in the heap
       if variable has null value that means it does not point any object in memory
      */

        String myString=null;
        System.out.println(myString);
        //System.out.println(myString.toLowerCase());---NullPointerException
         //Primitives can not null, since they are not objects.
        //Wrapper class variables can be null.
        //Whenever we create a custom , and add Non-Primitive instance variables,
        //they are by default will be null.
        /*
        public class Building{
        String street;
        int numberOfFloors;
        boolean isResidence;
        }
        in this case, street assigned null by default
        int-->0
        double-->0.0
        boolean-->false
        String-->null
        char-->''

        Whenever we declare instance variables, they are assigned default values.
        instance(inside class, outside method)

        Local variables are variables declared inside any method
         Local variables they don't get any default values.for example

        public void Building{
        String street;
        int numberOfFloors;
        boolean isResidence;
          public void rent(){ ---->>they don't get any default value.
          double price;
          int floorNumber;
          String resident;

              }
        */



    }

}
