package day00;

import org.w3c.dom.ls.LSOutput;

public class Practice14 {
    public static void main(String[] args) {
        String str =      "abcdefghijklmnopqrstuvwxyz";
        String reversed = "zyxwvutsrqponmlkjihgfedcba";


        for(int i=0;i<str.length();i++){
            char letter=str.charAt(i);
         int inx= str.indexOf(letter);
           // System.out.print(letter);
           for(int n=0;n<reversed.length();n++){

           }
            System.out.println(letter+""+reversed.charAt(inx));
        }

    }
}
/*for(int i=0;i<str.length();i++){
           char letter=str.charAt(i);
            //System.out.println(letter);
            int idx=str.indexOf(letter);
            for(int n=0;n<reversed.length();n++){
               // System.out.println(letter+"-->"+reversed.charAt(idx));

            }System.out.println(letter+"-->"+reversed.charAt(idx));

* */