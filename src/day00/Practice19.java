package day00;

import java.util.Arrays;

public class Practice19 {
    public static void main(String[] args) {
        System.out.println(unlucky(new int[]{1,3,5, 6, 7, 8, 1, 1}));
        int [] Arr={1,2,3,4,5,6,7,78};
        System.out.println(Arrays.stream(Arr).max());
        System.out.println(Arrays.stream(Arr).min());

    }
    public static boolean unlucky(int[]nums){
        boolean result=true;
        for(int i=0;i< nums.length;i++){
            if((nums[0]==1 && nums[1]==3)||(nums[nums.length-2]==1 && nums[nums.length-1]==3)){
                result=true;
            }else{
                result=false;
            }
        }
        return result;

    }
}
