package day_51_abstraction;

public class TeslaTruck extends TeslaSemi{
    @Override
    public void start() {
        System.out.println("Tesla truck is starting");
    }

    @Override
    public void charge() {
        System.out.println("Tesla truck charging");

    }

    @Override
    public void drive() {
        System.out.println("Tesla truck is driving");

    }

    @Override
    public void load(String items) {
        System.out.println("Tesla truck is loading "+items);

    }
    @Override
    public void stop(){
        System.out.println("Tesla truck car stopping by pushing break... ");
    }
}



