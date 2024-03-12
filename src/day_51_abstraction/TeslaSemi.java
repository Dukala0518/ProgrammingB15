package day_51_abstraction;

public class TeslaSemi extends ElectricTruck{
    @Override
    public void start() {
        System.out.println(model+" is starting");
    }

    @Override
    public void charge() {
        System.out.println(model+" charging");

    }

    @Override
    public void drive() {
        System.out.println(model+" is driving");

    }

    @Override
    public void load(String items) {
        System.out.println(model+" is loading "+items);

    }
    @Override
    public void stop(){
        System.out.println(model+" car stopping by pushing break... ");
    }
}
