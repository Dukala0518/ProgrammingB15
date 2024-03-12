package day_45_sataic_keyword;

public class VehicleTest {
    public static void main(String[] args) {
        //print numberOfVehicles static way
        System.out.println(Vehicle.numberOfVehicle);
        Vehicle.numberOfVehicle=10;
        Vehicle v1=new Vehicle("Toyota");
        System.out.println(v1.numberOfVehicle);
        Vehicle v2=new Vehicle("Nissan");
        System.out.println(v2.numberOfVehicle);
        System.out.println(Vehicle.numberOfVehicle);

        System.out.println(v1.numberOfVehicle);
        Vehicle v3=new Vehicle("Cherry");
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);
        System.out.println(v3.numberOfVehicle);
        System.out.println(v2.numberOfVehicle = 300);
        System.out.println(v1.numberOfVehicle);
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());
        System.out.println(v1.getModel());

    }
}
