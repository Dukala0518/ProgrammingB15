package day08_if_statements;

public class BonusCalculator {
    public static void main(String[] args){
        double salary=1000.0;
        double sales=9500.0;
        double bonus=0.0;
        if(sales>=10000.0){
            bonus+=500;
            salary+=bonus;
        }else{bonus+=50.0;
            salary+=bonus;
        }
        System.out.println("Your salary is $"+salary+" and your bonus is $"+bonus);
    }
}
