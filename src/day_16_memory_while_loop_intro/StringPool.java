package day_16_memory_while_loop_intro;

public class StringPool {
    public static void main(String[] args) {

        String word1="java";
        String word2="java";
        String word3=new String("java");

        System.out.println(word1==word2);
        System.out.println(word1==word3);
        System.out.println(word1.equalsIgnoreCase(word3));
        String word4=new String("Java");
        System.out.println(word3==word4);
        String word5=word2;
        System.out.println(word5==word4);

        String str="macbook";
        String str2="macbook";
        String str3="str";





    }
}
