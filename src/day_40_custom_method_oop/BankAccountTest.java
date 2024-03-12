package day_40_custom_method_oop;

public class BankAccountTest {
    public static void main(String[]args){
        BankAccount bOFA=new BankAccount();
        bOFA.accountNumber=123456789;
        bOFA.balance=5000.0;
        bOFA.accountHolder="Dulamsuren Bezgsuren";
        bOFA.displayInfo();
        System.out.println(bOFA.accountHolder);

        BankAccount capitalOne=new BankAccount();
        capitalOne.setInfo(4500.0,987654321,"Bilguun");
        capitalOne.displayInfo();

        bOFA.deposit(1000.0);
       // capitalOne.deposit(10000.0);
        bOFA.withDraw(10.0);
        bOFA.withDraw(100000);
        capitalOne.deposit(5000);
        capitalOne.withDraw(1000);
        capitalOne.withDraw(10000.0);

        bOFA.displayInfo();
        capitalOne.displayInfo();
        bOFA.purchase("shoes",120);
    }
}
