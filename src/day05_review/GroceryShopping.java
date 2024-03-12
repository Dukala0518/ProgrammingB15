package day05_review;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.println("Welcome to Trader Joe's");
       System.out.println("How much is are potatoes?");
       double potatoes= input.nextDouble();
       System.out.println("How much are tomatoes?");
       double tomatoes=input.nextDouble();
       System.out.println("How much are eggs?");
       double eggs=input.nextDouble();
       double total=potatoes+tomatoes+eggs;
       System.out.println("Your total is "+total);

    }
}

