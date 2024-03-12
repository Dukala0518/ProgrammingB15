package day06_operators;
import java.util.Scanner;
public class NextLine {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("What is your full name?");
        String name=input.nextLine();

        System.out.println(name+ " is coding Java");
        System.out.println("Enter your address");
        String address=input.nextLine();

        int apples=5;
        apples=apples-2;
        System.out.println(apples);
        int total=50;
        int num=10;
        total=total-num;
        System.out.println(total);



    }
}
