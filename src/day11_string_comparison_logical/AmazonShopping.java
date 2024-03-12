package day11_string_comparison_logical;
import java.util.Scanner;
public class AmazonShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Amazon");
        System.out.println("Are you a prime member?");
        String answer = input.next();
        boolean primeMember;
        if (answer.equals("yes")) {
            primeMember = true;
        } else {
            primeMember = false;
        }
            System.out.println("Enter your total:");
            double total = input.nextDouble();
            if(total<0){
                System.out.println("Invalid");
                return;
            }
            if (primeMember || total >= 25.0) {
                System.out.println("Free shipping");
            } else {
                System.out.println("Delivery fee $5.99");

            }
        }

    }

