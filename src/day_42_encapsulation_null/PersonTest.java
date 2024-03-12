package day_42_encapsulation_null;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        // p1.name="Dukala";
        //p1.age=31;
        System.out.println(p1.toString());
        p1.setName("Dukala");
        System.out.println(p1.getName());
        System.out.println(p1.toString());
        Person p2=new Person();
        p2.setName("Bilguun");
        System.out.println(p2.getName());
        System.out.println(p2.toString());
        p1.setAge(12);
        System.out.println(p1.getAge());
        System.out.println(p1.toString());
        p2.setAge(600);
        //Usually when java programmers create a class with instance variables, we
        //automatically set all variables as private. and getter/setter methods.
        //We can make our variables private even if there is no pre-conditions
        //When absolutely necessary, we can slowly make our variables non-private.
        //access modifier
        //.....private
        //......default
        //......protected
        //.....public







    }
}
