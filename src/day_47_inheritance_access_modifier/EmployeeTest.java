package day_47_inheritance_access_modifier;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.calculatePay(40,10);
        FullTime fullTime=new FullTime();
        fullTime.calculatePay(40,10);
        Contractor contractor=new Contractor();
        contractor.calculatePay(40,10);

        System.out.println(employee.toString());
        System.out.println(contractor.toString());
        System.out.println(fullTime.toString());




    }
}
