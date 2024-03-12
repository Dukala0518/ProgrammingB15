package day_51_abstraction.Student;

public abstract class Student {
    String name;
    public Student(){
    }
    public abstract void attendClass();
    public void code(String language){
        System.out.println("day_51_abstraction.Student is coding "+language);
    }
}
