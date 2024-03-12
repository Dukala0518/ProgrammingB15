package day_17_while_do_while_loop;

import javax.swing.plaf.IconUIResource;

public class InitCap {
    public static void main(String[] args) {
        String word="java";
        String J=word.substring(0,1);
        System.out.println(J);
        J=J.toUpperCase();
        System.out.println(J);
        System.out.println(J+word.substring(1,4));

        String word1="comPUTER";
        int P=word1.indexOf("P");
        int R=word1.indexOf("R");
        int m=word1.indexOf("m");
        String PUTER= word1.substring(P,R+1).toLowerCase();
        String com=word1.substring(0,m+1).toUpperCase();
        System.out.println(com+PUTER);
        //"code java"-->"JAVA CODE";

        String word3="java";














    }
}
