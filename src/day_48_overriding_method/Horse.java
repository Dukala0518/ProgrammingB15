package day_48_overriding_method;

public class Horse extends Animal{
    @Override
    public void speak() {
        System.out.println("Horse is saying haha");
    }

    @Override
    public void move() {
        System.out.println("Horse is moving ");
    }
    public void eat(String food){
        System.out.println("Horse is eating "+food);
    }
}


