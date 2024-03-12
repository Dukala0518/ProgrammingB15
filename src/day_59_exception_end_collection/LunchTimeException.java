package day_59_exception_end_collection;

public class LunchTimeException extends Exception{
    public LunchTimeException(){
    }
    public LunchTimeException(String msg){
        super(msg);
    }
}
