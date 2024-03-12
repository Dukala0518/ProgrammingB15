package day_16_memory_while_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word="dad";
        String reversed="";
        System.out.println(word.charAt(2));
        reversed=reversed+word.charAt(2);
        System.out.println(reversed);
        reversed+=word.charAt(1);
        System.out.println(reversed);
        reversed=reversed+word.charAt(0);
        System.out.println(reversed);;
        String reversed2="";
        reversed2=reversed+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println(reversed2);
        if(word.equals(reversed)){
            System.out.println("Palindrome 3 letter word");
        } else{
            System.out.println("Non Palindrome");
        }



    }
}
