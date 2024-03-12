package day_31_multidArrays_;

import java.util.*;

public class DimensionalArray {
    public static void main(String[] args) {
        //************What is Dimensional Array***********
        //An Array Object that store other arrays
        //Declare 2D array list
        String[][] list;
        //String list[][];
        //String[] list[];
        String [][]lists=new String [4][3];
        //add veggies
         lists[0][0]="Potatoes";
         lists[0][1]="Carrots";
         lists[0][2]="Onions";
         //add fruits
        lists[1][0]="Apples";
        lists[1][1]="Grapes";
        lists[1][2]="Mangoes";
        //add diary
        lists[2][0]="Eggs";
        lists[2][1]="Milk";
        lists[2][2]="Cheese";

        //add bread
        lists[3][0]="Bread";
        lists[3][1]="Mufflin";
        lists[3][2]="Bagel";
        System.out.println(lists[0][0]+","+lists[0][1]+","+lists[0][2]);
        System.out.println(lists[1][0]+","+lists[1][1]+","+lists[1][2]);
        System.out.println(lists[2][0]+","+lists[2][1]+","+lists[2][2]);
        System.out.println(lists[3][0]+","+lists[3][1]+","+lists[3][2]);

        System.out.println(Arrays.deepToString(lists));

        String fruit=lists[1][1];
        System.out.println("My favourite fruit is "+fruit);
        //lest find out how many arrays in the 2D array?
        System.out.println("How many arrays"+lists.length);
        //how many veggies?
        System.out.println("Number of veggies "+lists[0].length);
        //how many fruits?
        System.out.println("Number of fruits "+lists[1].length);
        //how many diaries?
        System.out.println("Number of diaries "+lists[2].length);
        //how many bakery?
        System.out.println("Number of bakery "+lists[3].length);
        //how to print using a loop
        //print all vegetables using loop

        for(int i=0;i<lists[0].length;i++){
            System.out.println(lists[0][i]);
        }
        //print all bakery
        for(int i=0;i<lists[3].length;i++){
            System.out.println(lists[3][i]);
        }
        //print diary using each loop
        for(String idx:lists[2]){
            System.out.println(idx);
        }
//print all items using nested for loop
        for(int i=0;i<lists.length;i++){
            for(int n=0;n<lists[i].length;n++){
                System.out.println("."+lists[i][n]);
            }
        }
    }
}
