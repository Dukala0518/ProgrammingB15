package day11_string_comparison_logical;

public class WeatherIfElse {
    public static void main(String[] args) {
        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("Go to park");
        } else {
            System.out.println("Stay home");
        }
        String item = "Wooden Spoon";
        if (item.equals("wooden spoon")) {
            System.out.println("15.928 wooden spoons for sale");
        } else {
            System.out.println("no wooden spoons");
        }

        if (item.equalsIgnoreCase("wooden spoon")) {
            System.out.println("15.928 wooden spoons for sale");
        } else {
            System.out.println("no wooden spoons");
        }
    }
}
