package day_36_wrapper;

public class WrapperClassArray {
    public static void main(String[] args) {
        System.out.println(add(12, 23));
        System.out.println(getAllNumbers("Java is 100 percent fun 1,2,3,"));
        System.out.println(getAllNumbers("123"));
        System.out.println(getAllNumbers("java is 2"));
    }
    public static Integer add(Integer a, Integer b){
        return a+b;
    }
    public static Integer getAllNumbers(String nums){
        String numbers="";
        for (int i = 0; i < nums.length(); i++) {
            if(Character.isDigit(nums.charAt(i))){
                numbers=numbers+nums.charAt(i);
            }
        }
        return Integer.valueOf(numbers);
        //Java collections-->Arrays,All other collections.
        //Arrays can use/store primitives.
        //All other collections in Java, cannot work with primitives.
        //They all need wrapper class object.
        //This is another important reason for why we need Wrapper classes.
    }

    }