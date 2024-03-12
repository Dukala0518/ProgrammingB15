package day12_ternary_string_manipulation;
import java.util.Scanner;
public class CapitalCity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String capital= input.next();
        System.out.println("What is the capital of Turkey");
        if(capital.equalsIgnoreCase("Ankara")){
            System.out.println("Correct");
        } else{
            System.out.println("Incorrect");
        }
    }
}
