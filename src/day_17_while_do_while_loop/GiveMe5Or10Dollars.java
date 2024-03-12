package day_17_while_do_while_loop;

import java.util.Scanner;

public class GiveMe5Or10Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Outside the loop");
        int dollar = scan.nextInt();
        while (dollar != 5 && dollar != 10) {
            System.out.println("Give me 5 dollars or 10 dollars");
            System.out.println("Inside the loop");
            dollar = scan.nextInt();
        }
        System.out.println("Thank you");
    }
}
