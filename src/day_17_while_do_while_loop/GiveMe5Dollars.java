package day_17_while_do_while_loop;
import java.io.DataOutput;
import java.util.Scanner;

public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //System.out.println("Give me 5 Dollars");
        int dollar=0;

        while(dollar!=5){
            System.out.println("give me 5 Dollars");
            dollar= scan.nextInt();
        }
        System.out.println("Thank you for 5 dollars");

        

    }
}
