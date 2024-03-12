package day_34_practice_methods;

public class FormatString {
    public static void main(String[] args) {
        String results = "About 968,000,000 results (0.62 seconds) ";
        String countOfResult = results.split(" ")[1];//split and get index [1]
        countOfResult = countOfResult.replace(",", "");
        long count = Long.parseLong(countOfResult);// convert string numbers into long
        getNumberOfGoogleSearchResults("About 43,400,000 results (0.42 seconds) ");
        System.out.println(getNumberOfGoogleSearchResults("About 43,400,000 results (0.42 seconds) "));
        repeatString("Duka", 4, '^');
        repeatString("I love Java",2,'!');
        System.out.println(repeatStrings("Duka", 4, '*'));

    }

    public static long getNumberOfGoogleSearchResults(String sentences) {
        String number = sentences.split(" ")[1];
        number = number.replace(",", "");
        long count = Long.parseLong(number);
        return count;
    }

    public static void repeatString(String word, int times, char delimiter) {
        //repeatString ("java","3","%");
        //--->java%java%java%
        for (int i = 0; i < times; i++) {
            System.out.print(word + delimiter);
        }
        System.out.println();
    }

    public static String repeatStrings(String word, int times, char delimiter) {
        String sda = "";
        for (int i = 0; i < times; i++) {
            sda = sda + word + delimiter;
        }
        return sda;
    }

}
