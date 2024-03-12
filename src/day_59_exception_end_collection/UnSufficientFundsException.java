package day_59_exception_end_collection;

public class UnSufficientFundsException extends RuntimeException {
    public UnSufficientFundsException(){
        super();
    }
    public UnSufficientFundsException(String desc){
        super(desc);
    }
}
