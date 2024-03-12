package day_51_abstraction;

public class Tesla extends ElectricCar{



    @Override
public void start(){
    System.out.println(model+" is starting quietly and its price is "+price);
    System.out.println("Change to drive mode...");
}
    @Override
public void charge(){
    System.out.println("Tesla is charging-Plugin to Electric outlet ");

}
    @Override
    public void drive(){
        System.out.println("Ford is driving");
    }

    public void stop(){
        System.out.println("Tesla  car stopping by pushing break... ");
    }

}
