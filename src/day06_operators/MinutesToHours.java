package day06_operators;
import java.util.Scanner;
public class MinutesToHours {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int minutes=input.nextInt();
        int hours=minutes/60;
        int remainingMinutes=minutes%60;
        System.out.println(remainingMinutes);
        System.out.println(hours+" hours "+ remainingMinutes+" Minutes");




    }
}
