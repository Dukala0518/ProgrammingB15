package day11_string_comparison_logical;
import java.util.Scanner;
public class CarShopping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Car Dealer");
        System.out.println("Enter car model");

        String car= input.next();
        System.out.println("Enter your budget");
        double price= input.nextDouble();
        double budget=35000.0;
        if((car.equals("bmw")||car.equals("tesla")||car.equals("toyota"))&& price<budget){
            System.out.println("CONGRATULATIONS");
        } else{
            System.out.println("See you soon");

        }



    }
}
