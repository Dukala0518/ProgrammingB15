package day_22_arrays_introduction;

public class ArraysWithNumbers {
    public static void main(String [] args ){
        //declare numArray with 5 numbers
        //assign values to each index
        // 1. way to declare
        int [] numArray=new int [5];
        numArray[0]=65;
        System.out.println(numArray[0]);
        numArray[1]=76;
        System.out.println(numArray[1]);
        numArray[2]=89;
        numArray[3]=75;
        numArray[4]=numArray[0]+numArray[1];
        //Print last one using .length-1
        System.out.println(numArray[numArray.length-1]); //----------->>141 give you numArray[4] index4

        //System.out.println(numArray);------->give you hashCode

        //2. way
        // declare and assign values in same statement
        int [] numberArray={65,76,89,75,141};

        //3. way to declare
        int [] numberArrays=new int[]{65,76,89,75,141};

        //4. way
        // declare 3 int variables and assign values
        int n1=65;
        int n2=75;
        int n3=78;
        int[] numsArrays={n1,n2,n3};

        //Print all numbers using a for loop
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]+" ,");


        }




    }
}
