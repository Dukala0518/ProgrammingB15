package day_31_multidArrays_;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MultiplicationChart {
    public static void main(String[] args) {
        int[][] table =new int[10][10];

        for(int outer=1;outer<=10;outer++){
            for(int inner=1;inner<=10;inner++){
                //System.out.print(inner*outer+(" "));
                table[outer-1][inner-1]=outer*inner;

            }
           System.out.println();
        }
        System.out.println(Arrays.deepToString(table));
for(int[]eachrow:table){
    for(int col:eachrow){
        System.out.print(col+"\t");

    }
    System.out.println();
}
    }


}
