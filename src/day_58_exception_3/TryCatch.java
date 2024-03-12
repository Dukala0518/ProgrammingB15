package day_58_exception_3;

import java.io.FileReader;
import java.util.*;

public class TryCatch {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("file.csv");
            }catch(Exception e){
                System.out.println("FileNotFoundException is handled!");
                e.printStackTrace();

            }
        System.out.println("AFTER TRY CATCH");
        try {
            int[] number = {23, 12, 54};
            System.out.println(number[0]);
            System.out.println(number[2]);
            System.out.println(number[3]);
        }catch (Exception e){
            System.out.println("ArrayIndexOfBoundsException was handled");
        }

        System.out.println("After Array");

        }
    }

