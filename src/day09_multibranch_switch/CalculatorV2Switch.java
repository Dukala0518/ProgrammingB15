package day09_multibranch_switch;

public class CalculatorV2Switch {
    public static void main(String[] args){
        double num1=5.0;
        double num2=3.0;
        char operator='0';
        switch(operator){
            case'+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Error");

        }

        }
    }

