package day_33_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        addNumbers(31,90);
        int sum=add(10,4);
        System.out.println(sum);
        System.out.println(add(44,22));
        System.out.println(subtract(55,88));
    }
    public static void addNumbers(int num1, int num2){
        int result=num1+num2;
        System.out.println("Result: "+result);
    }
    public static int add(int num1,int num2){
        int result=num1+num2;
        return result;
    }
    public static int subtract(int num1,int num2){
        int result=num1-num2;
        return result;
    }
}
