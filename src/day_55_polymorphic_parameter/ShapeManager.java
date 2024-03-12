package day_55_polymorphic_parameter;

import day_54_polymorhism.Diamond;
import day_54_polymorhism.Shape;
import day_54_polymorhism.Square;
import day_54_polymorhism.Triangle;

import java.util.*;

public class ShapeManager {
    public static void drawSquare(Square SQ){
        System.out.println("Drawing Square");
        SQ.draw();
    }
    public static void drawShape(Shape SH){
        System.out.println("Drawing Shape..."+SH.type+" ...");
        SH.draw();
    }
    public static void drawShape(List<Shape> ShapeList){

        for(int i=0;i<ShapeList.size();i++){
            System.out.println("Drawing a shape-"+ShapeList.get(i).type);
            ShapeList.get(i).draw();
        }
    }
    public static Shape buildShape(String type) {
        if (type.equals("Square"))
            return new Square();
        else if (type.equals("Triange")) {
            return new Triangle();
        } else if (type.equals("Diamond")) {
            return new Diamond();
        } else {
            return null;

        }
    }
}
