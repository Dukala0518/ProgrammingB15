package day07_operators_casting_boolean_if;

public class BooleanComparisonOperators {
    public static void main(String[] args){
        System.out.println(57 < 6);
        System.out.println(57 <58);
        System.out.println(88>=77 );
        System.out.println(88>=88 );
        System.out.println(88<=77 );
        System.out.println(10<=15);
        System.out.println(10<=10);

        System.out.println(10==10);
        System.out.println(10==100);

        System.out.println(5!=4);//true
        System.out.println(10!=10);//

        boolean b1=123>100;
        System.out.println(b1);

        int currentSpeed=60;
        int speedLimit=55;
        boolean overLimit=currentSpeed<speedLimit;
        boolean overLimit2=speedLimit>currentSpeed;
        System.out.println(overLimit);



        int num=100;
        if(num<=100) {
            System.out.println("num is less than 100");
        }else{ System.out.println("num is not less than 100");


            }

        }













    }

