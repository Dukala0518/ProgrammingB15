package day04_math_operators_scanner;

public class Calculation {
    public static void main(String[] args){
        double price1=15.5;
        double price2=55.1;
        double price3=10.0;
        double totalPrice=price1+price2+price3;
        System.out.println("Total price:"+totalPrice);

        double balance=1200;
        double remainingBalance=balance-totalPrice;
        System.out.println("Remaining Balance:"+remainingBalance);

        int linesOfCode=25,classCount=6;
        int codeWritten=linesOfCode*classCount;
        System.out.println("Total lines of code:"+codeWritten);

        int totalLinesOfCode=linesOfCode*classCount;
        System.out.println("Total lines of code:"+totalLinesOfCode);






    }

}
