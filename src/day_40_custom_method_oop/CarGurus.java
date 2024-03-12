package day_40_custom_method_oop;

public class CarGurus {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.model="Tesla";
        car1.price=100.000;
        car1.color="white";
        car1.year=2022;
        car1.drive();
        car1.displayPrices();

        Car ca2=new Car();
        ca2.model="BMW";
        ca2.price=50.000;
        ca2.color="white";
        ca2.year=2022;
        ca2.drive();
        ca2.displayPrices();

        Car car3=new Car();
        car3.setCarInfo("Ford",85.000,"White",2018);
        car3.displayPrices();

        Car car4=new Car();
        car4.setCarInfo("Prius",40.000,"Blue",2000);
        car4.drive();
        car4.displayPrices();

        System.out.println(car4.model);
        System.out.println(car4.price);
        System.out.println(car4.color);
        System.out.println(car4.year);

        //call getCarInfo for all car object we have

        car1.getCarInfo();
        ca2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();

        //compare prices of car1 and car 2 and print which one is more expensive
        if(car1.price> ca2.price){
            System.out.println(car1.model+" is more expensive than "+ca2.model);
        }else{
            System.out.println(ca2.model+" is more expensive than "+car1.model);
        }





    }
}
