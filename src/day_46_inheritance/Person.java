package day_46_inheritance;

public class Person {
    public String name;
    public int age;
    public char gender;

    public void Walk(){
        System.out.println(name+" is walking...");
    }
    public  void Speak(){
        System.out.println(name+" is speaking loudly hahaha");
    }
    public void Eat(String meal){
        System.out.println(name+" is eating "+meal);

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
