package day_54_polymorhism;

import java.util.ArrayList;

public class InstanceOf {
    public static void main(String[] args) {
        Shape diamond=new Diamond();
        System.out.println(diamond.getClass().getSimpleName());
        Shape shape=new Square();
        System.out.println("shape is referring to object of "+shape.getClass().getSimpleName());
        if(shape instanceof Diamond){
            System.out.println("Shape is Diamond");
        }
        ArrayList<Shape> shapeArraylist=new ArrayList<>();
        shapeArraylist.add(new Diamond());
        shapeArraylist.add(new Shape());
        shapeArraylist.add(new Triangle());
        shapeArraylist.add(new Square());
        shapeArraylist.add(new Diamond());
        shapeArraylist.add(new Shape());
        shapeArraylist.add(new Triangle());
        shapeArraylist.add(new Square());
        shapeArraylist.add(new Diamond());
        shapeArraylist.add(new Shape());
        shapeArraylist.add(new Triangle());
        shapeArraylist.add(new Square());
        shapeArraylist.add(new Diamond());
        shapeArraylist.add(new Shape());
        shapeArraylist.add(new Triangle());
        shapeArraylist.add(new Square());
        int shapeCount, triangleCount,diamondCount,squareCount;
        shapeCount=triangleCount=diamondCount=squareCount=0;

            }
        }

       


