package day_31_multidArrays_;

import java.util.Arrays;

public class NumberTwoD {
    public static void main(String[] args) {
        int [][]nums2D={
                {12,55,4,7},
                {123,555,9},
                {56,87,455,34},
                {234,12,54,23,23}
        };
        //print length of each array
       for(int i=0;i< nums2D.length;i++){
           System.out.println(nums2D[i].length);
       }for(int i=0;i<nums2D.length;i++){
            System.out.println();
           for(int j=0;j<nums2D[i].length;j++){
               System.out.print(nums2D[i][j]+" ");
           }
        }
        System.out.println();
       for(int each=0;each<nums2D.length;each++){
           Arrays.sort(nums2D[each]);
          // System.out.println(Arrays.deepToString(nums2D));
       }System.out.println(Arrays.deepToString(nums2D));
       //print all numbers separated by space in new line for each 1s array
       for(int[] nums1D: nums2D){
           for(int num:nums1D){
               System.out.print(num+" ");
           }
           System.out.println();
           //count sum all numbers and print out
           int sum=0;
           for(int i=0;i<nums2D.length;i++){
               for(int j=0;j<nums2D[i].length;j++){
                   sum+=nums2D[i][j];
               }
           }
           System.out.println(": "+sum);
       }

        }

    }

