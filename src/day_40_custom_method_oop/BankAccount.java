package day_40_custom_method_oop;

public class BankAccount {
    double balance;
    int accountNumber;
    String accountHolder;

        public void setInfo(double pBalance, int pAccNumber,String pAccHolder){
        System.out.println("Setting account info");
        balance=pBalance;
        accountNumber=pAccNumber;
        accountHolder=pAccHolder;
        }
        public void displayInfo(){
            System.out.println("Checking account: "+balance+" "+accountNumber+" "+accountHolder);
    }
    public void deposit(double amount){
        System.out.println("You are depositing: "+amount);
        balance=balance+amount;
        System.out.println("Your balance is: "+balance);
    }
    public void withDraw(double amount){
        System.out.println("Your are withdrawing: "+amount);
        if (amount < balance) {
            balance=balance-amount;
            System.out.println("Your balance is: "+balance);
        }else{
            System.out.println("Your balance is insufficient");
        }


    }
    public void purchase(String item, double price){
        System.out.println("Purchasing: "+item+" for "+price);
        balance=balance-price;
        System.out.println(balance);
        if(price>balance){
            System.out.println("NO NO KEEP CODING JAVA");
        }else{
            balance=balance-price;
        }
    }







}
