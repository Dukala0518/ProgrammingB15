package day_13_string_manipulation;

public class StringCharAT {
    public static void main(String[] args) {
      /*  String company="Cybertek";
        System.out.println(company.length());
        System.out.println(company.charAt(0));
        System.out.println(company.charAt(1));
        System.out.println(company.charAt(2));
        System.out.println(company.charAt(3));
        System.out.println(company.charAt(4));
        System.out.println(company.charAt(5));
        System.out.println(company.charAt(6));
        System.out.println(company.charAt(7));
        //System.out.println(company.charAt(8));
        char first=company.charAt(0);
        System.out.println(first);
        if(first=='C'){
            System.out.println("correct");
        } else{
            System.out.println("incorrect");
        }*/
        String word="civic";//palindrome word
        char firstL=word.charAt(0);
        char lastL=word.charAt(4);
        if(firstL==lastL){
            System.out.println("match");
        } else{
            System.out.println("not match");
        }
        System.out.println(word.charAt(0)+" "+word.charAt(1)+" "+word.charAt(2)+" "+word.charAt(3)+" "+word.charAt(4));
        String str="Wooden Spoon";
        System.out.println(str.contains(""));
    }
}
