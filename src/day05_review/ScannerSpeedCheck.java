package day05_review;
import java.util.Scanner;
public class ScannerSpeedCheck {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to SpeedCheck program");
        System.out.println("Enter your current speed:");
        int currentSpeed=input.nextInt();
        int speedLimit=55;
        int overTheLimit=currentSpeed-speedLimit;
        System.out.println("You are driving "+overTheLimit+" mph over the limit!");


    }
}

