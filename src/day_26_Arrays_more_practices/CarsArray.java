package day_26_Arrays_more_practices;

import java.util.Arrays;

public class CarsArray {
    public static void main(String[] args) {
        String []myCars={"Ford","Chevy","Toyota","Honda","Mazda","Kia","Hyundai",};
        for(int i=0;i< myCars.length;i++){
           if(myCars[i].equals("Ford")||myCars[i].equals("Chevy")){
               System.out.println(myCars[i]+" is American car.");
           } else if(myCars[i].equals("Toyota")|| myCars[i].equals("Honda")
                   ||myCars[i].equals("Mazda")){
               System.out.println(myCars[i]+" is Japanese car.");
           } else if (myCars[i].equals("Kia")||myCars[i].equals("Hyundai")){
               System.out.println(myCars[i]+" is Korean car");

            }else{
               System.out.println("Unknown car!");
           }


        }
    }
}
