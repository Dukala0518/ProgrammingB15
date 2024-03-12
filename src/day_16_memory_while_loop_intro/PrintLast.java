package day_16_memory_while_loop_intro;

public class PrintLast {
    public static void main(String[] args) {
        /*String word="Java is so much fun";
        System.out.println(word.charAt(word.length()-1));
        int count=word.length();
        System.out.println(word.charAt(count-1));*/

        String word="java";
        System.out.println(word.substring(1,3));
        System.out.println(word.substring(1,2));
        System.out.println(word.substring(4));
        System.out.println(word.substring(1,4));


        String some="{^^}";
        String first=some.substring(0,2);
        String last=some.substring(2,4);
        String str="java";
        System.out.println(first+str+last);



    }
}
