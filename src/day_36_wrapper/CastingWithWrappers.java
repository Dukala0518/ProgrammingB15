package day_36_wrapper;

public class CastingWithWrappers {
    public static void main(String[] args) {
        //casting primitives
        int intValue=123;
        double doubleValue=intValue;
        System.out.println(doubleValue);

        Integer wrapperInt=Integer.valueOf(100);
        Double wrapperDouble=(double)wrapperInt;
        System.out.println(wrapperDouble);
        //Double wrapperDouble=wrapperInt;

        //Double wrapperDouble=wrapperInt; ERROR; CANNOT CAST AMONG WRAPPERS.
        //  Wrapper class methods: that we learnt today/
        //valueOf
        //parseDouble, parseInt,parseBoolean... etc are commonly used methods that are in wrapper class.




    }
}
