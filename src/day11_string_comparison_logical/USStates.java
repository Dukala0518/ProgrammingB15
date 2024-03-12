package day11_string_comparison_logical;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class USStates {
    public static void main(String[] args) {
        String state="VA";
        if(state.equals("VA")){
            System.out.println("VA");
        } else if (state.equals("NY")) {
            System.out.println("New York");
        } else if (state.equals("IL")){
            System.out.println("Illinois");
        } else if(state.equals("CA")){
            System.out.println("California");
        } else{
            System.out.println("Other State");

    }
}
}
