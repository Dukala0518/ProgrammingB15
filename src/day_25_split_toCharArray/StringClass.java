package day_25_split_toCharArray;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        //String class internally uses char[] value-array to store the characters.
// String class has many manipulation method that can use in our programming.
        //so it is important to understand and be able to use string method.
        //------------split() method in String-----------------
        String words="java,ruby,java, something, java python";
        words.split("," );
        String [] newArr=words.split(",");
        String methods="java,ruby,python,c++";
        //split the words by "," and assign to String
       String[]methodsArr=methods.split(",");
        System.out.println(methodsArr.length);
       System.out.println (Arrays.toString(methodsArr));
       String result="About 117,000,000 results (1.33 seconds)";
      String [] resultArr= result.split(" ");

        System.out.println(resultArr[1]);
        //using for each loop print everything in separate lines.
        for(int iin=0;iin<resultArr.length;iin++){
            System.out.println(resultArr[iin]);
       //for( String item:resultArr){
           //System.out.println(item);
       }
        System.out.println("Search result count "+resultArr[1]);
        System.out.println("ishihs");
        System.out.println("bhjbdscd");











    }
}
