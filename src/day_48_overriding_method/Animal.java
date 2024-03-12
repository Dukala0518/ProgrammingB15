package day_48_overriding_method;

public class Animal {
    public void speak(){
        System.out.println("Animal is saying  ...");
    }
    public void move(){
        System.out.println("Animal is running fast...");

    }
    public void eat(String food){
        System.out.println("Animal is eating "+food);
    }
}
