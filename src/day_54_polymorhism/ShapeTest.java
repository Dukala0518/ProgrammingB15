package day_54_polymorhism;

import java.util.Locale;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shape shape=new Shape();
        Square square=new Square();
        //square.squareMethod();
        square.draw();
        Triangle triangle=new Triangle();
        triangle.draw();
        Diamond diamond=new Diamond();
        diamond.draw();
        System.out.println("***************************");
        Shape shape1;
        shape1=new Triangle();
        shape1.draw();
        shape1=new Diamond();
        shape1.draw();
        new Triangle().draw();
        new Diamond().draw();
        new Square().draw();
        System.out.println("Java".toUpperCase());
        //create 4 shapes using polymorphism

        Shape shape2=new Shape();
        shape2.draw();
        shape2=new Triangle();
        shape2.draw();
        shape2=new Square();
        shape2.draw();
        //DOWN CASTING:cast reference type to object type
        //DOWN CASTING:cast reference from parent type to child type
        ((Square) square).squareMethod();



        shape2=new Diamond();
        shape2.draw();



    }
}

