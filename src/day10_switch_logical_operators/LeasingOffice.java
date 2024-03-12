package day10_switch_logical_operators;

public class LeasingOffice {
    public static void main(String[] args) {
        System.out.println("WELCOME TO AVALON");
        int numberOfBedrooms = 1;
        double startingPrice=0.0;
        switch(numberOfBedrooms){
            case 1:
                System.out.println("one bedroom selected");
                startingPrice=2000.0;
                break;
            case 2:
                System.out.println("two bedroom selected");
                startingPrice=2500.0;
                break;
            default:
                System.out.println("error");

            }
                System.out.println(startingPrice);
             if(startingPrice>1200){
            System.out.println("EXPENSIVE");

               }
        }


    }

