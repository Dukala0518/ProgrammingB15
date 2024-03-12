package day_33_methods_with_return;

public class MethodWithReturn {
    public static void main(String[] args) {
        System.out.println(getName());
        String myName=getName();
        System.out.println(myName);
        System.out.println(giveMe5Dollars());
        int wallet=giveMe5Dollars();
        System.out.println(wallet);
    }
    public static String getName(){
        return "Dukala";
    }
    public static int giveMe5Dollars(){
        int dollar=5;
        return dollar;

    }
}
