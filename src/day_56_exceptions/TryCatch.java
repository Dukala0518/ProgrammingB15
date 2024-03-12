package day_56_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("BEFORE TRY CATCH: ");
        try{
            System.out.println("IN TRY BLOCK");
            int result=10/2;
            System.out.println("AFTER 10/0 LINE");

        }catch (ArithmeticException e){
            System.out.println("EXCEPTION HAPPENED AND WAS HANDLED");
        }

        System.out.println("AFTER TRY CATCH");
        System.out.println("______________________________________");
        try{
            System.out.println("IN SECOND TRY BLOCK");
            String str="java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch(Exception e){
            System.out.println("EXCEPTION HAPPENED IN TRY BLOCK AND WAS HANDLED");

        }
        System.out.println("AFTER SECOND TRY CATCH...");
    }
}
