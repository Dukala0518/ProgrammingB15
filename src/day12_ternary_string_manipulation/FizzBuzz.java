package day12_ternary_string_manipulation;

public class FizzBuzz {
    public static void main(String[] args) {
        int num=5;

        if(num%5==0 && num%3==0){
            System.out.println("fizzbuzz");
    } else if(num%3==0){
            System.out.println("fizz");
        } else if(num%5==0){
            System.out.println("buzz");
        }

    }
}
