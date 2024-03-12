package day_18_for_loop;

public class PrintEveOddNumbers {
    public static void main(String[] args) {
        //1-100 print all odd numbers,

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                int newI=i;
                System.out.print(newI+" ");
                System.out.print(" ");
            } else if(i%2==1){
                int newI=i;
                System.out.print(newI+" ");
            }
            }
        }
    }



