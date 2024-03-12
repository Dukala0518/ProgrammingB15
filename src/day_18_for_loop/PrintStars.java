package day_18_for_loop;

public class PrintStars {
    public static void main(String[] args) {
        //PRINT 10 STARS, EACH ITERATION YOU ARE PRINTING 1 STAR.
        String star="*";

        for (int num = 0; num < 10; num++) {
            System.out.println(star);
            star +="*";
        }

        star="**********";
        for (int num = 10; num > 0; num--) {
            System.out.println(star);
            star = star.substring(0,num-1);
        }

        }
    }


