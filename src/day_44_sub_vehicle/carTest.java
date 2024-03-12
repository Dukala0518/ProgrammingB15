package day_44_sub_vehicle;

import day_43_constructors_custom_class_list.CatTest;
import day_44_static_field.Vehicle;

public class carTest extends Vehicle {
    int mileage;

    public static void main(String[] args) {
        carTest c1=new carTest();
        //String make is not inherited because it is in different package also it is
        //default access modifier
        c1.mileage=35000;
        //I would like to get String make value and int year value what should I do?
        c1.setYear(2016);
        System.out.println(c1.getYear());
        //protected String make;
        //protected access modifier make the member accessible in subclass in different package
        c1.make="Toyota Corola";
        System.out.println(c1.make);

        //access modifier completed
        //public --->accessible anywhere
        //protected--->accessible in same package
                  //---->accessible different package inside Sub class
        //only place it can not reached is different package and not subclass
        //default-->no access modifier, only within the package,also known as a package private
        // private --?only accessible within the same class



    }

}
