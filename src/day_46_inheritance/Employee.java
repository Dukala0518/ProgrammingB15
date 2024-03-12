package day_46_inheritance;

public class Employee extends Person{
    public String jobTitle;
    public void Work(){
        System.out.println(name+" is working hard and she earns well as "+jobTitle);
    }


}
