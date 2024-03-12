package day_51_abstraction.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student st=new Student() {
            @Override
            public void attendClass() {
                System.out.println("day_51_abstraction.Student st is attending class");

            }

        };
        st.attendClass();
        st.code("Java");

        CampusStudent campus=new CampusStudent();
        campus.name="Duka";
        campus.code("Java");
        campus.attendClass();
        campus.playPingPong();

        System.out.println("----------------------------------");
        CalambaStudent calamba=new CalambaStudent();
        calamba.code("Java");
        calamba.getVisa();
        calamba.attendClass();




    }
}
