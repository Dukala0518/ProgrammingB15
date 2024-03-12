package day00;
import java.util.*;
public class Practice7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        String ab = "";
        int min = 0;
        if (a.length() < b.length()) {
            min = a.length();
        }
        for (int i = 0; i < min; i++) {
            ab = ab + a.substring(i, +i + 1) + b.substring(i, i + 1);

        }
        if (a.length() > b.length()) {
            min = b.length();
        }
        for (int i = 0; i < min; i++) {
            ab = ab + b.substring(i, +i + 1) + a.substring(i, i + 1);

        }
        System.out.println(a.substring(min));
       // System.out.println(ab);


    }
}
