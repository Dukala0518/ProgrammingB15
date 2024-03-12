package day_37_arraylist;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;


public class PriceList {
    public static void main(String[] args) {
      ArrayList<Double>prices=new ArrayList<>(Arrays.asList(99.99,5.44,89.90,1000.0,45.9));
      //Calculate sum of all prices
        double sum=0;
        for(double each:prices){
            sum=sum+each;
        }
        System.out.println(sum);
        double sum2=0;
        for(int i=0;i<prices.size();i++){
            sum2=sum2+ prices.get(i);
        }
        System.out.println(sum2);
        //Declare double arraylist cheap

        ArrayList<Double>cheap=new ArrayList<>();
        ArrayList<Double>expensive=new ArrayList<>();
        for(int i=0;i<prices.size();i++){
            if(prices.get(i)<20.0){
               cheap.add(prices.get(i));
            }else{
                expensive.add(prices.get(i));
            }
        }
        System.out.println(cheap);
        System.out.println(expensive);

    }
}
