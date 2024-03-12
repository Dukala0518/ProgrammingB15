package day_58_exception_3;

public class TryWithFinally {
    public static void main(String[] args) {
        try{
            System.out.println("in the try block");
            System.out.println(9/0);
        }finally {
            System.out.println("Finally block...");
        }
        System.out.println("After try finally");
    }
}
