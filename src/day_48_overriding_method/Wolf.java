package day_48_overriding_method;

public class Wolf extends Animal{
    public void speak(){
        System.out.println("Wolf  is roaring ...");
    }
    public void move(){
        System.out.println("Wolf is running...");

    }
    public void eat(String food){
        System.out.println("Wolf is eating "+food);
    }

}
