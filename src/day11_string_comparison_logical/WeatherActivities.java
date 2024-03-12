package day11_string_comparison_logical;

public class WeatherActivities {
    public static void main(String[] args) {
        String weather="windy";

        switch (weather){
            case "sunny":
                System.out.println("Go to park");
                System.out.println("Code Java");
                break;
            case "hot":
                System.out.println("Go swimming");
                System.out.println("Code Java");
                break;
            case "windy":
                System.out.println("Fly kite");
                System.out.println("Code Java");
                break;
            default:
                System.out.println("Stay home");
                System.out.println("Code Java");


        }
    }

}
