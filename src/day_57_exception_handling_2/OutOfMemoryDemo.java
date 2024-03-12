package day_57_exception_handling_2;
import java.util.*;
public class OutOfMemoryDemo {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        for(int i=1;i<10;i++){
            System.out.println(i);
            number.add(i);
        }
        System.out.println(number.get(2));



    }
}
