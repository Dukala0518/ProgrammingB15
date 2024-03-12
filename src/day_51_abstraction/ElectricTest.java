package day_51_abstraction;

public class ElectricTest {
    public static void main(String[] args) {
        Tesla modelS=new Tesla();
        modelS.model="model S";
        modelS.price=10000.00;
        modelS.charge();
        modelS.start();
        modelS.drive();
        modelS.stop();

        TeslaSemi semi=new TeslaSemi();
        semi.model="Semi";
        semi.price=1500000.00;
        semi.color="black";
        semi.charge();
        semi.start();
        semi.drive();
        semi.load("products");
        semi.stop();

        TeslaTruck truck=new TeslaTruck();
        truck.charge();
        truck.drive();
        truck.start();
        truck.load("Tomatoes");
        truck.stop();

        System.out.println(modelS.toString());


    }

}
