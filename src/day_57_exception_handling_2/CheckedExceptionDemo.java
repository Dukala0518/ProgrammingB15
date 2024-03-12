package day_57_exception_handling_2;

import org.w3c.dom.ls.LSOutput;

public class CheckedExceptionDemo {
    public static void main(String[] args)throws InterruptedException  {
        System.out.println("Checked Exception in next line");

        Thread.sleep(1000);

            System.out.println("Exception handled");


        }

}


