package day_30_car_practice;

import java.util.Arrays;

public class CarsInfo {
    public static void main(String[] args) {
        String[] car = {"Mini-Cooper", "Porsche-Cayman", "Oldsmobile-Achieve", "Mini-Cooper",
                "Porsche-Cayman", "Oldsmobile-Achieve",
                "Mini-Cooper", "Porsche-Cayman", "Oldsmobile-Achieve"};

        String[] mini=new String[3];
        int index=0;
        for(int i=0;i<car.length;i++){
            if(car[i].startsWith("Mini")){
                mini[index]=car[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mini));


    }
}
