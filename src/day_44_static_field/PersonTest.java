package day_44_static_field;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Dukala", 31);
        p1.species="Human";

        System.out.println("p1= "+p1);
        Person p2 = new Person("Bilguun", 31);
        p2.species="Humanoid";

        System.out.println("p2= "+p2);
        Person p3=new Person("Erdemt",3);
        System.out.println("p3= "+p3);

        System.out.println(Person.species);

    }
}
