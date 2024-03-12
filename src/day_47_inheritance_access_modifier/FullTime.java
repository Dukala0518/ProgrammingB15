package day_47_inheritance_access_modifier;

public class FullTime extends Employee {
    private double bonus;

    public FullTime(String name, String title, double bonus) {
        super(name, title);
        this.bonus = bonus;
    }
    public void calculatePay(int hours,int rate ){
        System.out.println("Full time employee total pay is: "+(hours*rate)*1.25);

    }



    public FullTime(){
        super("Duka","QA Engineer");
        System.out.println("No args constructor full time");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
