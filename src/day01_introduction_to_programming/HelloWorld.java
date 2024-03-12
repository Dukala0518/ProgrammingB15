package day01_introduction_to_programming;

public class HelloWorld {
    public static void main(String[] args){
        String word="hadgadah";
        String palindrom="";

        for(int i=word.length()-1;i>=0;i--){
            palindrom=palindrom+word.charAt(i);

        }
        System.out.println(palindrom);
        if(word.equals(palindrom)){
            System.out.println("this is palendrome");
        }else {
            System.out.println("this is not palendrome");
        }




    }

}

