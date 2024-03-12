package day_14_string_manipulation;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringContains {
    public static void main(String[] args) {
        String email="student@gmail.com";
        System.out.println(email.contains("@"));
        System.out.println(email.contains("w"));
        System.out.println(email.contains("gmail"));
        System.out.println(email.contains("tud"));
        Boolean hasDotCom=email.contains(".com");
        System.out.println("hasDotCom = " + hasDotCom);

        String list="milk,eggs,bread,meat,water,chocolate,apple";
        if(list.contains("eggs")){
            System.out.println("Egg is in there!");
        } else{
            System.out.println("Forgot to buy eggs");
        }
        if(list.contains("banana")){
            System.out.println("Bananas in there");
        } else {
            System.out.println("Lets get some banana!");
        }
        Boolean hasMilk=list.contains("milk");
        System.out.println(hasMilk);
        if(hasMilk){
            System.out.println("We got milk");
            boolean hasWater=list.toUpperCase().contains("WATER");
            System.out.println("hasWater = " + hasWater);

        }



        }
        }




