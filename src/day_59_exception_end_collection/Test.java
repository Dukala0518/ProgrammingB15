package day_59_exception_end_collection;

public class Test {
    public static void main(String[] args) throws LunchTimeException{
       // throw new UnSufficientFundsException();
        double balance=1000;
        double price=145.99;
        String itemName="shoes";
        if(balance<price){
            throw new UnSufficientFundsException("Not enough funds with this transaction");

        }else{
            balance=balance-price;
            System.out.println("Transaction successful. Enjoy your new "+itemName);
            System.out.println("Remaining balance "+balance);
        }
       int time=12;
        if(time>=1) {
            throw new LunchTimeException("BREAK TILL 2:23");
        }else {
            System.out.println("Keep coding Java");
        }
    }
}
