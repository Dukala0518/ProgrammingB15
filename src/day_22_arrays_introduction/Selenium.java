package day_22_arrays_introduction;

public class Selenium {
    public static void main(String[] args) {
        //Selenium+Java
        //Selenium+C#
        //Selenium+Python
        //Selenium+Ruby
        int something[] = new int[6];
        something[0] = 478;
        something[1] = 7668;
        something[2] = 8598;
        something[3] = 78758;
        something[4] = 95;
        something[5] = 77;
        for (int i = 0; i < something.length; i++) {
            if (something[i] >= 100) {
                System.out.println(something[i] + "|");
            }
        }
        System.out.println();
        //print array items in reverse in same line
        for(int i = something.length - 1; i > 0; i--) {
            System.out.print(something[i] + "|");
        }
       //for each loop and enhanced for loop
        //it only works with array and other collection.



        }
    }


