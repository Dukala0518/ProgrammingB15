package day_45_sataic_keyword;

public class VariableAccess {
    int instanceCount=10;
    static int staticCount=15;
    public static void staticMethod(){
        System.out.println(staticCount);
    }
    public void nonStaticInstanceMethod(){
        System.out.println(instanceCount);
        System.out.println(staticCount);
    }

    public static void main(String[] args) {

     //static calls
        //System.out.println(instanceCount);--->it does not work.(because it is not static varaibles)
        System.out.println(staticCount);
        staticMethod();
        //nonStaticInstanceMethod();--->it is not static I cant call

        //how to access instance(non-static) variables/method
        //first create object using new key word
        VariableAccess obj=new VariableAccess();
        System.out.println(obj.instanceCount);
        obj.nonStaticInstanceMethod();

    }
}
/*Why main method is static in Java?
Because static method can be called without creating an object, so JVM
is able to invoke the main method directly from classname.
STATIC VARIABLES
   --> can be accessed using classname, no need
   -->shared variables, always single copy(value)for a all object
STATIC METHOD
   --> can be using classname, no need for object
   -->static method can only access static variables or methods
STATIC BLOCK
   -->code is static block runs ONCE when class is used before everything else.
   -->we can use this to initialize static variables,or do any other setup.
In java, whenever we use the class,CLASS LOUDER.
When classloader is loading the class it will look for
static block, of there is one, it will run it.
STATIC INNER/NESTED CLASS
   -->In java, we can create a class inside another class, that is called INNER/NESTED class
   that class can be STATIC

*/
