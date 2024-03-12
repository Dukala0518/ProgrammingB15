package day00;

import java.util.Arrays;

public class Practice12 {
    public static void main(String[] args) {
        //Given an array of ints length 3, return an array with the elements "rotated left"
        // so {1, 2, 3} yields {2, 3, 1}.

        //rotateLeft3([1, 2, 3]) → [2, 3, 1]
        //rotateLeft3([5, 11, 9]) → [11, 9, 5]
        //System.out.println(rotateLeft(new int[]{1, 2, 3, 4}));
        System.out.println(Arrays.toString(rotateLeft(new int[]{5, 6, 7, 8})));
    }
    public static int []rotateLeft(int [] nums){
        int[]Arr=new int[]{};
        for(int i=0;i<nums.length-1;i++){
            Arr= new int[]{nums[i + 1]};
        }

        return Arr;
    }
}
