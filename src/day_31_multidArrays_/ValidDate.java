package day_31_multidArrays_;

public class ValidDate {
    public static void main(String[] args) {
        int[] dates = {29, 2, 2016};
        boolean isValid;
        int month = dates[1];
        int date = dates[0];
        int year = dates[2];
        //check for any invalid month, day, year
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (date > 0 && date <= 31) {
                System.out.println("valid");
            }
        }else if(month == 4 || month == 6 || month == 11) {
            if (date > 0 && date <= 30) {
                System.out.println("valid");
            }
        }else if(month == 2 && year % 4 == 0) {
            if(date == 29) {
                System.out.println("valid");
            }else if (date > 0 && date <= 28) {
                System.out.println("valid");
        }

    } else {
        System.out.println("invalid");
    }
}
}













