package day_57_exception_handling_2;

public class DifferenceBetweenCheckedUnchecked {
    /*
    What is the difference between checked and unChecked
    Checked exceptions
            must be handled to declared to  code to compile
            checked exceptions are throwable, exception and all subclasses except
            runTimeException class
            must be handled using try catch block or declared using
            throws keyword for code to compile.
    Unchecked exceptions
            code will compile even if we do not handle unchecked exceptions
            Unchecked exception is   runTimeException and all of its sub classes.
            are optional to be handled.Normally happen during runtime, due to programming mistakes

            HANDLING EXCEPTIONS:
            try{
                 code you want to protect.
                 code might throw exception.
             } catch(Exception e){
                 code to run when exception is caught.
             }finally{
                 code that will run, if there is exception or no
                }

            }






    */
}
