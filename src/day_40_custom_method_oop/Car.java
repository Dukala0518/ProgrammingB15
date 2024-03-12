package day_40_custom_method_oop;

public class Car {
    //variables:
    String model;
    double price;
    String color;
    int year;
    //behaviours
    public void drive(){
        System.out.println(model+" is driving");
    }
    public void displayPrices(){
        System.out.println(model+" costs "+price);
    }
    public void setCarInfo(String newModel,double newPrice, String newColor, int newYear ){
        //assign param variables to object variable
        model=newModel;
        price=newPrice;
        color=newColor;
        year=newYear;
    }
    public void getCarInfo(){
        System.out.println(model+" "+price+" "+color+" "+year);

    }



}
