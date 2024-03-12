package day_16_memory_while_loop_intro;

import java.util.Arrays;

public class WhileLoopIntro {
    public static void main(String[] args) {
        int num=1;
        while (num<=10){    //infinite loop
            System.out.println("Hello World!");


            int steps=1;
            while(steps<=100){
                System.out.println("Taking a step"+steps);
                steps++;
            }

        }


    }
}
