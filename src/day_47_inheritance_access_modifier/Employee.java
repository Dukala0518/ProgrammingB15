package day_47_inheritance_access_modifier;

public class Employee {
    private String name;
    private String title;
    public Employee(){
        System.out.println("No args constructor");
    }
    public void calculatePay(int hours,int rate ){
        System.out.println("Employee total pay is: "+(hours*rate));

    }

    @Override
    public String toString() {
        return "Employee toString()";
    }

    public Employee(String name, String title){
        System.out.println(name+" is working as a "+title);
        this.name=name;
        this.title=title;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
