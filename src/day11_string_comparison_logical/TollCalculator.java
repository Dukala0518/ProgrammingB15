package day11_string_comparison_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicle="car";
        boolean isRushHour=true;
        double price=0.0;
        if(vehicle.equalsIgnoreCase("car")&& isRushHour) {
            price = 3.0;
            System.out.println("CAR AND NON-RUSH HOUR");
        }else if(vehicle.equalsIgnoreCase("car")&& isRushHour){
            price=7.50;
            System.out.println("CAR AND RUSH HOUR");
        }else if(vehicle.equalsIgnoreCase("truck")&& !isRushHour){
            price=4.75;
            System.out.println("TRUCK AND NOT RUSH HOUR");
        }else if(vehicle.equalsIgnoreCase("truck")&& isRushHour){
            price=11.0;
        }else{
            System.out.println("NOT");
        }
        System.out.println("Your total is "+price);


    }
}
