package day_24_array_practice;
import java.util.Arrays;
public class ArraysEquals2 {
    public static void main(String[] args) {

        //copies values from one array into another
        //you can copy whole array or just part of it
        String[] cars={"BMW","Tesla","Honda"};
        String[] newCars= Arrays.copyOf(cars,1);  //[BMW] (only copy first 1
        System.out.println(Arrays.toString(newCars));



    }
}
