package day_44_static_field;

public class Vehicle {
    protected String make;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start(){
        System.out.println("Starting "+make);
    }
    public void goForward(){
        System.out.println(make+" is going forward");
    }
}
