package day_45_sataic_keyword;

public class Vehicle {
    private  String model;
    public static int numberOfVehicle;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //public Vehicle(){
        //System.out.println("Parking Unknown model Vehicle");
       // numberOfVehicle++;
    //}
    public Vehicle(String model){
        System.out.println("Parking "+model);
        this.model=model;
        numberOfVehicle++;
    }



}
