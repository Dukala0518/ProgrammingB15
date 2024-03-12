package day_55_polymorphic_parameter;

import day_54_polymorhism.Diamond;
import day_54_polymorhism.Shape;
import day_54_polymorhism.Square;
import day_54_polymorhism.Triangle;

import java.util.ArrayList;
//import day_55_polymorphic_parameter.ShapeManager;


public class TestShape {
    public static void main(String[] args) {
        Square SQQ=new Square();
        ShapeManager.drawSquare(new Square() );
        ShapeManager.drawSquare(SQQ);
        ShapeManager.drawShape(new Diamond());
        Diamond dm=new Diamond();
        ShapeManager.drawShape(dm);
        ShapeManager.drawShape(new Square());
        System.out.println("--------OBJECT PARAMETER-----------");
        ArrayList<Shape>myList=new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Triangle());
        myList.add(new Diamond());
        ShapeManager.drawShape(myList);
        System.out.println("========");
       // ShapeManager.buildShape(new String());
        ShapeManager.buildShape("Diamond").draw();







        }
    }

