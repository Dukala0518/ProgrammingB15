package day_30_car_practice;

import java.util.Arrays;

public class CarsInfoArrays {
    public static void main(String [] args){
        String [] cars={"Mini-Cooper","Porsche-Cayman","Oldsmobile-Achieve","Mini-Cooper",
                "Porsche-Cayman","Oldsmobile-Achieve",
                "Mini-Cooper","Porsche-Cayman","Oldsmobile-Achieve"};

        //TASK1:Count how many cars in there?
        System.out.println("Total cars count:"+cars.length);
        //TASK2: Print first, last car info
        System.out.println("First car is:"+cars[0]);
        System.out.println("Last car is:"+(cars[cars.length-1]));

        //TASK3:Count number of "Mini-Cooper" and store int variable

        int miniCooper=0;
        for(int i=0; i<cars.length;i++){
            if(cars[i].equalsIgnoreCase("mini-cooper")){
                miniCooper++;

            }

        }
        //TASK4 Declare array MiniCooper, and assign all honda make-models to it.

        String[] miniCoopers =new String[miniCooper];
        int counter=0;
        for(int i=0;i< cars.length;i++){
            if(cars[i].startsWith("Mini")){
                miniCoopers[counter]=cars[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(miniCoopers));
        //TASK5: Declare array cars with masked models
        //and mask each model from cars array and assign and print

        String[] maskedCar=new String[cars.length];
        for(int i=0;i<cars.length;i++){
          String special []=  cars[i].split("-");
          String make=special[0];
          String eachModel=special[1];
          //build star according to eachModel.length
            String star="";
          for(int x=0;x<eachModel.length();x++){
              star=star+"*";

          }
            System.out.println(make+"-"+star);
          maskedCar[i]=make+"-"+star;


        }
        System.out.println(Arrays.toString(maskedCar));
        

            }
        }


