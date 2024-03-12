package day12_ternary_string_manipulation;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1=55;
        int num2=110;
        int max=(num1>num2)? num1 : num2;
        System.out.println(max);
        System.out.println("max = " + max);

        int score=55;
        String result="";
               result= (score>60)? "good" : "bad";
        System.out.println("result = " + result);

         }

    }

