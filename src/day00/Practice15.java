package day00;

import java.util.Arrays;

public class Practice15 {
    public static void main(String[] args) {
        //Given an array of ints length 3, return a new array with the elements in reverse order,
        //so {1, 2, 3} becomes {3, 2, 1}.

        int[] Arr3={1,2,3};
        int[]Reversed=new int[3];
        int n = 0;
      for(int i=Arr3.length-1;i>=0;i--){
          System.out.println(Arr3[i]);
          Reversed[n] = Arr3[i];
            n++;

      }
        System.out.println(Arrays.toString(Reversed));

    }


    }

