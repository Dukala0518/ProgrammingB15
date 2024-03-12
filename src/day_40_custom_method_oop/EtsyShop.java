package day_40_custom_method_oop;
//purpose of this class is to have main method to execute,
// and create Objects from Product class
public class EtsyShop {
    public static void main(String[] args) {
        //Declare 2 product objects.
        Product prodObj=new Product();
        Product prodObj2=new Product();
        //assign value to prodObj
        prodObj.title="Wooden mug";
        prodObj.price=9.99;
        prodObj.rating=5;
        prodObj.seller="Banana";
        prodObj2.title="Wooden fork";
        prodObj2.price=2.99;
        prodObj2.rating=4;
        prodObj2.seller="Banana";
        //when we create objects from a class, each object will have its own
        //variables-when you assign values to one object, it will not affect others.

        //print values from object prodObj1
        System.out.println(prodObj.title+prodObj.price+prodObj.rating+prodObj.seller);
        //call the method of Product class
        //Object name.methodName();
        prodObj.displayInfo();
        prodObj2.displayInfo();








    }
}
