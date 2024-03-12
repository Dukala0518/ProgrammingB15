package day08_if_statements;
import java.util.Scanner;
public class CheckPinCode {
    public static void main(String[] args){
        System.out.println("Please enter your pin number");

        Scanner input=new Scanner(System.in);
        int secretPinCode=input.nextInt();
        int inputPinCode=2350;
        if(inputPinCode==secretPinCode) {
            System.out.println("Welcome to you account");
            System.out.println("You can withdraw");
        }else{
            System.out.println("Invalid access");
            System.out.println("Access denied!");











        }




    }
}
