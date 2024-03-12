package day_58_exception_3;
import java.net.*;
public class TryCatchFinally {
    /*
    WE USE FINALLY BLOCK WHEN WE HAVE CODE THAT NEEDS TO RUN ALWAYS,
       NO MATTER THERE IS EXCEPTION OR NO EXCEPTION. IT GUARANTEES CODE EXECUTION.
       EXCEPT UNDER 2 SITUATION, FINALLY WILL NOT RUN:
       1. System.exit(0) is in catch or try block and gets excuted
       2. JVM crash, error
       */
    public static void main(String[] args) {

        try {
            System.out.println("IN TRY BLOCK");
            URL etsyURL=new URL("www.etsy.com");
            System.out.println("END OF TRY BLOCK");
        } catch (MalformedURLException e) {
            System.out.println("IN CATCH BLOCK");
            System.out.println("Reason "+e.getMessage());
        }finally {
            System.out.println("IN FINALLY BLOCK");

        }
        System.out.println("After try catch finally");

        try {
            System.out.println("in 2nd try block");
            int num = Integer.parseInt("123abc");
            System.out.println("end of second try block");
        }catch(NumberFormatException e){
            System.out.println("in catch block");
            System.out.println("getMessage "+e.getMessage());
            System.out.println("getCause "+e.getCause());

        }finally {
            System.out.println("in 2nd finally block--runs all the time");
        }
        System.out.println("After second try catch finally");



    }
}
