package day_17_while_do_while_loop;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random=new Random();    //will help to generate random numbers
        int secretNumber = random.nextInt(100);
        System.out.println("Enter your first guess secret number");
        int guessNumber;
        do{
            guessNumber= scan.nextInt();
            if(secretNumber<guessNumber){
                System.out.println("Wrong your number is too large");
            } else if(secretNumber>guessNumber){
                System.out.println("Wrong your number is small");
            }
        } while(guessNumber!=secretNumber);
        System.out.println("Congrats1");

        }
    }

