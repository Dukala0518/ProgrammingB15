package day00;

import java.util.Arrays;

public class Practice18 {
    public static void main(String[] args) {
        //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        System.out.println(Arrays.toString(NewArray(new int[]{1, 7, 3}, new int[]{1, 7, 3})));
        System.out.println(Arrays.toString(NewArr(new int[]{1, 2, 3, 4, 5, 6, 7})));

    }
    public static int[] NewArray(int[] a,int[]b){
        int []New=new int[2];
        New[0]=a[1];
        New[1]=b[1];
        return New;
    }
    //Given an array of ints, return a new array length 2 containing the
    // first and last elements from the original array. The original array will be length 1 or more.
    public static int[] NewArr(int[]nums){
        int[] New=new int[2];
        New[0]=nums[0];
        New[1]=nums[nums.length-1];
        return New;
    }
}
