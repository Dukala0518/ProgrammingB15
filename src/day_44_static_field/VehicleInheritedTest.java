package day_44_static_field;

public class VehicleInheritedTest extends Vehicle{
    int wagonCount;
    public void makeChoChoSound(){
        System.out.println("chooo chooo");
    }

    public static void main(String[] args) {
        VehicleInheritedTest t1=new VehicleInheritedTest();
        t1.makeChoChoSound();
        t1.make="Thomas";
       // t1.year=2020; it is private ,so it is not inherited
        t1.setYear(2020);
        System.out.println(t1.getYear());//calling the method we got from vehicld
        t1.start();
        t1.goForward();


    }

}
