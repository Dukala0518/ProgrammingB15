package day_58_exception_3;
import java.util.*;
public class ScannerTry {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value: ");
        try{
        int n=scan.nextInt();
        System.out.println("n= "+n);
        }catch (InputMismatchException e){
            System.out.println("Invalid input, only numbers are allowed");
            System.out.println("Try again");
            main(null);
        }
        System.out.println("Successfully entered");

    }
}
