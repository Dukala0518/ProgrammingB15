package day06_operators;

public class CoinConverter {
    public static void main(String[] args){
        //dollars
        //quarters
        //dimes
        //nickels
        //pennies

        int cents=130;
        int dollars=cents/100,quarters=cents/25,dimes=cents/10,nickels=cents/20;
        System.out.println(dimes+dollars+nickels+quarters);


    }
}
