package day_46_inheritance;

public class PersonStudentTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Duka";
        p1.age=31;
        p1.gender='F';
        p1.Eat("Breakfast");
        Student s1=new Student();
        s1.name="Bill";
        s1.age=31;
        s1.gender='M';
        s1.courseName="Java";
        System.out.println(s1.name+" is learning "+s1.courseName);
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        s1.Walk();
        s1.Speak();
        p1.Walk();

        Employee Dukala=new Employee();
        Dukala.name="Dukala";
        Dukala.age=31;
        Dukala.gender='F';
        Dukala.jobTitle="AQ Engineer";
        Dukala.Work();
        Dukala.Eat("eggs");
    }

}
