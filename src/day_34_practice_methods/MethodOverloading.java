package day_34_practice_methods;

public class MethodOverloading {
    public static void main(String[] args) {

        /*-----------METHOD OVERLOADING-----------
        2 or more methods with SAME NAME and DIFFERENT PARAMETERS.
        2 methods with same name and same parameters types cannot exit in same class.
       ********** METHOD SIGNATURE******************
       METHOD SIGNATURE  is method name and method parameters.
       What is benefit of method overloading?
       it helps you have different custom method implementation with same name.
       just changing parameter, programmer is able to have a method with same name but different action.

       */


        sum(1,9);
        sum(4.5,8.5);

    }
    public static void sum(int num1, int num2){
        System.out.println("Result:"+(num1+num2));
    }
    public static void sum(double num1, double num2){
        System.out.println("Result:"+(num1+num2));
}

}
