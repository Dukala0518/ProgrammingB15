package day04_math_operators_scanner;

public class etsyItem {
    public static void main(String[] args){
        String title=("Soup Spoon");
        String seller=("PersonalizedGallery");
        double star= 5.0;
        int rating=8900;
        double price=8.00;
        boolean bestSeller=true, freeShipping=true;
       System.out.println("Item title is:"+ title);
       System.out.println("Seller name is:<"+seller+">");
       System.out.println("Product has "+star+" stars.");
       System.out.println("Product has "+rating+" ratings!");
       System.out.println("Price is $"+price);
       System.out.println("Best seller is "+bestSeller);
       System.out.println("Is it free shipping -"+freeShipping+" Great!");

       String city1="New York";
       String city2="Chicago";
       double ticketPrice=109.99;
       //From New York to Chicago is $109.99

        System.out.println("From "+city1+" to "+ city2+" is $" + ticketPrice);


    }
}
