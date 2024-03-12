package day_25_split_toCharArray;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {
        //to.CharArray
        //Converts string into char[] array.
        // Each character is assigned to individual index in the array
        String word="java";
       char[] letters= word.toCharArray();
        System.out.println(letters.length);
        for(char x:letters){
            System.out.println(x);
        }
        Arrays.sort(letters);
      System.out.print(Arrays.toString(letters));
      String str="budsguycsbhbugsuysx";
      char[] strArr=str.toCharArray();
      Arrays.sort(strArr);
      // after sorting create a new string with that value of array.
        String sorted=new String(strArr);//--------->>> array to one string
        System.out.println();
        System.out.println(str);

        System.out.println(sorted);




        }



    }

