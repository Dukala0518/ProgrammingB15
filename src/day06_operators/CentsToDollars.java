package day06_operators;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int cents=input.nextInt();
        int dollar=cents/100;
        int remainingCents=cents%100;
        System.out.println(dollar+" dollar and "+remainingCents+" cents ");

    }
}
