package day_15_string_manipulation;

public class SubString {
    public static void main(String[] args) {
        String word="Java is fun";
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(5,7));
        int wordNum=word.indexOf("f");
        System.out.println(wordNum);
        System.out.println(word.substring(8,11));
        System.out.println(word.substring(8));
    }
}
