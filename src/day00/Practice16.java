package day00;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Practice16 {
    public static void main(String[] args) {

       //Given an array of ints length 3, figure out which is larger,
        // the first or last element in the array, and set all the other elements to be that value. Return the changed array.
        //{1,2,3}{3,3,3}

        System.out.println(Arrays.toString(Larger(new int[]{4, 2, 3})));

    }
    public static int[] Larger(int[] nums){
        int []newNum= new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[0]>nums[2]){
                newNum[i]=nums[0];
            } if(nums[0]<nums[2]){
                newNum[i]=nums[2];
            }
        }
        return newNum;
    }
}
