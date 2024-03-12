package day_48_overriding_method;

public class AnimalTest {
    public static void main( String[] args){
        Animal animal=new Animal();
        animal.speak();
        animal.move();
        Cat cat=new Cat();
        cat.speak();
        cat.move();
        Horse horse=new Horse();
        horse.move();
        horse.speak();
        Wolf wolf=new Wolf();
        wolf.move();
        wolf.speak();
        animal.eat("food");
        cat.eat("cat food");
        horse.eat("grass");
        wolf.eat("fish");
    }
}
/*
METHOD OVERRIDING:
   It is ability to customize implementation  inherited method to child class
   When a method is inherited from super class to sub-class.
   In sub class, we can override it by creating a method with same name and same parameters
   2 methods with
         -same name
         -same parameters
         -inherited method only
 OVERRIDE ANNOTATION
     We put @Override on top of method , it will make sure that we are really overriding
     a method. how?
     it will check same method inherited and all overriding rules for(SAME NAME, SAME PARAMETERS)
BENEFIT:
   Makes sure we follow overriding rules
   Documentation for others to see that method was overridden
   It is optional to use
*/

