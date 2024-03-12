package day_54_polymorhism;

import java.util.ArrayList;

public class ShapeCollection {
    public static void main(String[] args) {
        //declare array that can store 2 squares
        Square[]squaresArr=new Square[2];
        squaresArr[0]=new Square();
        squaresArr[1]=new Square();
        squaresArr[0].draw();
        squaresArr[1].draw();

        Shape[] shapeArr=new Shape[4];
        shapeArr[0]=new Shape();
        shapeArr[1]=new Square();
        shapeArr[2]=new Triangle();
        shapeArr[3]=new Diamond();
        for(int i=0;i<shapeArr.length;i++){
            shapeArr[i].draw();
        }
        for(Shape each:shapeArr){
            each.draw();
        }
        ArrayList <Square>squareList=new ArrayList<>();
        squareList.add(new Square());
        System.out.println("----------------------------");
        ArrayList <Shape>shapeArraylist=new ArrayList<>();
        shapeArraylist.add(new Diamond());
        shapeArraylist.add(new Shape());
        shapeArraylist.add(new Triangle());
        shapeArraylist.add(new Square());
        for (int i=0;i<shapeArraylist.size();i++){
            shapeArraylist.get(i).draw();
        }





    }
}
