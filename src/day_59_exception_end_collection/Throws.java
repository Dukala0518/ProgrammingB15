package day_59_exception_end_collection;

public class Throws {
    public static void main(String[] args) throws InterruptedException{
        sleep(1);
        myMethod();
    }
    public static void sleep(int second) throws InterruptedException{
        System.out.println("Sleeping for "+second+" seconds");
        Thread.sleep(second*1000);
    }
    public static void myMethod() throws NullPointerException {
        System.out.println("myMethod, i might throw NullPointer Exception");
    }
}
