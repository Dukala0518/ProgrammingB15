package day_54_polymorhism;

public class Square extends Shape {
    public Square(){
        type="square";
    }
    public void draw() {
        System.out.println("SQUARE");
    }
    public void squareMethod(){
        System.out.println("Square method!");
    }

    }

