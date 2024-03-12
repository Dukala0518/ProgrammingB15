package day_47_inheritance_access_modifier;

public class Contractor extends Employee{
    @Override
    public String toString() {
        return "Contractor{}---"+super.toString();
    }

    @Override
    public void calculatePay(int hours,int rate ){
        System.out.println("Contractor total pay is: "+(hours*rate+200));


    }
}
