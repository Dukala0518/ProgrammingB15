package day_24_array_practice;

public class CopyArray {
    public static void main(String[] args) {
        //NOTE:
        //int[] num1={75,96,70,86};
        //int[] num2= you want to copy all the numbers of num1 to num 2.
        //you can do int[] num1=num2, but they point same memory,
        // and it will not work properly.
        int[] num1={75,96,70,86};
        //declare num2 with same size of num1
        int[] num2=new int[num1.length];
        //using for loop, read all values from num1 and assign to num2
        for(int i=0; i<num1.length; i++){
            num2[i]=num1[i];
        } for(int idx:num1){
            System.out.print(idx+" ");
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]+" ");

        }
        System.out.println();

        //Declare num3 with some size as num1 and assign all values in doubles.
        int[] num3=new int[num1.length];
        for(int i=0; i<num1.length;i++){
            num3[i]=num1[i]*2;
            System.out.print(num3[i]+" ");
        }
    }
}
