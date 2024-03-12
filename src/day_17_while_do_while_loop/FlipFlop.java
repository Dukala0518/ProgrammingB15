package day_17_while_do_while_loop;
import java.util.Scanner;
public class FlipFlop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //   "code java"---->"JAVA CODE"
        //   "hello world---->"WORLD HELLO"

        System.out.println("Enter two words");
        String word= scan.nextLine();
        int space=word.indexOf(" ");
        int n=word.length();
        String wooden=word.substring(0,space+1).toUpperCase();
        String spoon=word.substring(space,n).toUpperCase();
        String newWord= spoon+" "+wooden;
        System.out.println(newWord);








    }
}
