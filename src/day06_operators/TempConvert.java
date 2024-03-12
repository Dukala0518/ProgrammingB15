package day06_operators;
import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Fahrenheit value:");
        double fahrenheit=input.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit+" is "+(int)celsius+" in Celsius.");
        System.out.println("Enter Celsius value:");
        celsius=input.nextDouble();
        fahrenheit=(celsius*9/5)+32;
        System.out.println(celsius+" is "+fahrenheit+"in Fahrenheit");
        System.out.println("Enter number of days:");
        int numberOfDays=input.nextInt();
        int minutes=numberOfDays*7200;
        System.out.println("Minute is: "+minutes);

    }
}
