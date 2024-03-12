package day_21_nested_loop;
import java.util.*;
public class StarExercise {
    public static void main(String[] args) throws Exception {
        Random rnd=new Random();
        int d= rnd.nextInt(15)+1;   // random inputs only computer knows the number
        int b= rnd.nextInt(12)+1;

        for (int dooshoo = 0; dooshoo <= d; dooshoo++) {
            for (int i = 0; i < b; i++) {
                System.out.print("*");
            }
            System.out.println();
            Thread.sleep(678);    //make it slower
           // main(null);  //repeat main method again and again.it never gonna stop


        }

    }

}
