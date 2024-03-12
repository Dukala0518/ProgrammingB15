package day_20_for_loop_3;

public class Palindrome {
    public static void main(String[] args) {
        String word="RACE car";
        word=word.toLowerCase();
         //remove spaces
     word=word.replace(" ","");
        System.out.println(word);
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
            reversed=reversed+word.charAt(i);
        }
        System.out.println(reversed);
        System.out.println(word);
        if(word.equals(reversed)){
            System.out.println("Word is palindrome");
        } else{
            System.out.println("Word is not palindrome");
        }






    }
}
