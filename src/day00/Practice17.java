package day00;

import java.util.Arrays;

public class Practice17 {
    public static void main(String[] args) {
        //Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
        // just sum up the elements that exist,
        // returning 0 if the array is length 0.


        System.out.println(Sum(new int []{11,99,0}));

    }
    public static int Sum(int[] nums){
        int SumOf2=0;
        if(nums.length>=2){
            SumOf2=nums[0]+nums[1];
        } if(nums.length<2){
            SumOf2=nums[0];

        }
        return SumOf2;

    }
}
