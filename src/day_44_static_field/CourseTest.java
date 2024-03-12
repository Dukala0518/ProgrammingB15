package day_44_static_field;

public class CourseTest {
    public static void main(String[] args) {
        System.out.println(Course.counter);
        Course c1=new Course("Java","foundation");

        Course c2=new Course("Selenium","automation");
        Course c3=new Course("SQL","database");
        Course c4=new Course("API","webservice");
        Course c5=new Course("Agile","soft skills");
       System.out.println(Course.counter);



    }
}
