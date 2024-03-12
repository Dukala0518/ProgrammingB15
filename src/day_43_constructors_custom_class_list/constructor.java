package day_43_constructors_custom_class_list;

public class constructor {
    /*
    What is constructor in java?
    Constructor is a special method, runs automatically whenever object is created from a class.
    1.same name as class name;
    2.no return type
    Ex: public class Car{
          public Car(){
          System.out.println("Cat constructor")
          }
    }
    Cat cat1=new Cat;
    "Cat constructor"----> this is a result

    Why we need that?
    main purpose is to initialize instance variables.

    In java, there are few things are added to your class by compile-if you do not add them yourself
    1) DEFAULT constructor
       if programmer does not add any constructor, DEFAULT constructor is added by compiler.
For example: public class cellPhone{

}
           cellPhone c1=new cellPhone();
 when we run the above code, since we did not add any constructor, compiler
 will add DEFAULT constructor, so it becomes like this:
            public class cellphone{
            public cellphone(){      ---->>we don't see that
            }
         }
so all the classes that we wrote so far, that constructor that are added automatically
by compiler.
Programmer adds a constructor, compiler will not add any constructor.

When you write a class with instance variables it is better to add a constructor, so that
we can create object and assign data at same time.
data at
    */
}
