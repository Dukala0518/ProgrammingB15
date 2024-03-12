package day_48_overriding_method;

public class Cat extends Animal {
    public void speak(){
        System.out.println("Cat is saying meow...");
    }
    @Override //verify that move method is overridden
    public void move(){
        System.out.println("Cat is spoiling...");
    }
    @Override
    public void eat(String food){
        System.out.println("Cat is eating "+food);

    }


}
