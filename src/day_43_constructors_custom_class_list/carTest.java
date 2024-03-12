package day_43_constructors_custom_class_list;

import java.util.ArrayList;

public class carTest {
    public static void main(String[] args) {
        //create one car
        car car1=new car("tesla",100.000);
        //create 4 cars(Array)
        car[] carsArr=new car[3];
        carsArr[0]=new car("Nissan",35.000);
        carsArr[1]=new car("bmw",80.000);
        carsArr[2]=new car("prius",20.000);
        //create ArrayList cars
       ArrayList<car> carArrList=new ArrayList<>();
       carArrList.add(new car("Tesla",100.000));
        carArrList.add(new car("BMW",30.000));
        carArrList.add(new car("NISSAN",10.000));
        //OR I CAN ADD LIKE THIS
        car tesla=new car("Tesla",1000.000);
        carArrList.add(tesla);
        carArrList.add(tesla);
        carArrList.add(tesla);





    }
}
