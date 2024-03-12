package day_19_for_loop_practice;

public class PrintLettersLoop {
    public static void main(String[] args) {
       //            012345
        String name="Dukala";
        for (int i = 0; i < name.length(); i++) { //-------->length gives you 6,so you can minus-1 or take out=
            System.out.print(name.charAt(i));
        }
        for (int i = name.length()-1; i >=0 ; i--) {   //print your name in reverse
            System.out.print("  " +name.charAt(i));

        }


    }
}
