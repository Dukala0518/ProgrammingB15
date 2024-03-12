package day06_operators;

public class ChangeVariableValue {
    public static void main(String[] args){
        int student=50;
        System.out.println("Students "+student);
        student=student+10;
        System.out.println("Students "+student);
        student=student-2;
        System.out.println("Students "+ student);
        int b12student=3;
        student=student+b12student;
        System.out.println(student);

        double balance=250.0;
        double shoePrice=75.5;
        balance=balance-shoePrice;
        System.out.println("Your balance is: "+balance);

        double socks=9.99;
        balance=balance-socks;
        System.out.println("Your balance is: "+balance);

        double shirtPrice=77.5*2;
        balance=balance-shirtPrice;
        System.out.println("Your balance is: "+(int)balance);

        balance=balance*7;
        System.out.println("Your balance is: "+(int)balance);
         int apples=10;
         apples=apples-2;
         apples-=2;
         System.out.println(apples);
;
    }
}
