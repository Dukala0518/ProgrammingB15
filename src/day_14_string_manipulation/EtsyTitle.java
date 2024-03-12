package day_14_string_manipulation;

public class EtsyTitle {
    public static void main(String[] args) {
        String titles="Wooden spoon| Etsy";
        if(titles.startsWith("Wooden spoon") && titles.contains("|") && titles.endsWith("Etsy")){
            System.out.println("Test passed");
        } else{
            System.out.println("Test failed");
            System.out.println("Duka you are strong you can do that you are the best");
        }

        String word="Java";
        System.out.println(word.indexOf("J"));

    }
}
