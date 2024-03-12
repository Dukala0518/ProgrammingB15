package day_13_string_manipulation;

public class StringCaseConv2 {
    public static void main(String[] args) {
        String word="Hello World";
        System.out.println(word.toUpperCase());
        String uWord=word.toUpperCase();
        System.out.println("uWord = " + uWord);
        System.out.println("word = " + word);
        word=word.toUpperCase();
        System.out.println("word = " + word);
        String lword=word.toLowerCase();
        System.out.println("lword = " + lword);
        if(lword.equals("hello world")){
            System.out.println("lword = " + lword);
        } else {
            System.out.println("not lowercase");
        }


    }
}
