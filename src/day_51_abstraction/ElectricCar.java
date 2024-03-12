package day_51_abstraction;

public abstract class ElectricCar {
    String model;
    double price;
    String color;

    @Override
    public String toString() {
        return "ElectricCar{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void start();
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electric car stopping by pushing break... ");
    }



}
