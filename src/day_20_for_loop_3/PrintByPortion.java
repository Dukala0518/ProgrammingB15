package day_20_for_loop_3;

public class PrintByPortion {
    public static void main(String[] args) {
        String str="pizza, soup, chicken,sushi, shrimp, ice-cream";
        for(int n=0; n<str.length()-2;n++){
            //why -2, m der ireed m-iin hoinoos nemeh yum bhku uchir
            //System.out.println(str.charAt(n)+" "+str.charAt(n+1)+" "+ str.charAt(n+2));

            String temp=str.substring(n,n+4);
            System.out.println(str.substring(n,n+2));
        }

    }
}
