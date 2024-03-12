package day_50_method_hiding;

public class CarHasAEngine {
    public static void main(String[] args) {
        Engine myCarEngine=new Engine("m50b25i",192);
        System.out.println(myCarEngine.toString());

        Car tesla=new Car("super tesla",myCarEngine);
        System.out.println(tesla);
        System.out.println(tesla.engine);

        Engine mercedesEngine=new Engine("M256",89800);
        Car mercedes=new Car("Mercedes",mercedesEngine);
        Car mer=new Car("Mer",new Engine("m50b25i",192));
        Car corolla=new Car();
        corolla.setModel("Toyota Corolla");
        corolla.setEngine(new Engine("c45i",98700));



    }


}
