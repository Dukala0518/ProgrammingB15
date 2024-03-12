package day00;

public class Practice3 {
    public static void main(String[] args) {

       String star="**********";
        for (int i = 9; i > 0; i--) {
          //  System.out.println(star);
           System.out.println( star.substring(0,10-i));
       }
        String str="*";
        System.out.println(str);
        for(int i=0; i<=10;i++){
          str=str+"*";
            System.out.println(str);
        }


}}


