package day_57_exception_handling_2;

public class tryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try{
            System.out.println("Hello from try block");
            String str=null;
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println("Hello from catch block");
            System.out.println("Exception happened and caught");
        }
        finally {
            System.out.println("Hello from finally block");
        }
    }
}
