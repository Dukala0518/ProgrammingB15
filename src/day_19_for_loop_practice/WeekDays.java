package day_19_for_loop_practice;

public class WeekDays {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                System.out.println("1.Monday");
            } else if (i == 2) {
                System.out.println("2.Tuesday");
            } else if (i == 3) {
                System.out.println("3.Wednesday");
            } else if (i == 4) {
                System.out.println("4.Thursday");
            } else if (i == 5) {
                System.out.println("5.Friday");
            } else if (i == 6) {
                System.out.println("6.Saturday");
            } else if (i == 7) {
                System.out.println("7.Sunday");
            } else {
                System.out.println("No such a day");
            }
        }
    }
}
