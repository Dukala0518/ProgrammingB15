package day00;

public class Practice21 {
    public static void main(String[] args) {

        //Given an int array length 2, return true if it does not contain a 2 or 3.


    }
    public static boolean c23(int [] nums){
        boolean result=true;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=3){
                result=true;
            } else if (nums[i]!=2){
                result=true;
            } else{
                result=false;
            }
        }

        return true;

    }


    }