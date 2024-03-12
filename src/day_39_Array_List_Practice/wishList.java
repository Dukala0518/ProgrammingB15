package day_39_Array_List_Practice;
import java.util.*;
public class wishList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("iPhone 6s");
        items.add("iPhone 6s Plus");
        items.add("iPhone X");
        items.add("Macbook Pro");
        items.add("ThumbDrive");
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(449.0);
        prices.add(549.0);
        prices.add(1149.0);
        prices.add(1499.99);
        prices.add(39.99);
        ArrayList<Double> monthlyPayment = new ArrayList<>();
        monthlyPayment.add(18.71);
        monthlyPayment.add(22.88);
        monthlyPayment.add(56.16);
        monthlyPayment.add(79.49);
        monthlyPayment.add(2.68);
        //PRINT EACH LIST
        System.out.println("items= " + items);
        System.out.println("prices= " + prices);
        System.out.println("monthly payment= " + monthlyPayment);
        //PRINT WHOLE CATALOG [iPhone 6s-449-18.71]
        String items1 = "";
        // ArrayList<String> price1=new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + 1 + ". " + items.get(i) + "-" + prices.get(i) + "-" + monthlyPayment.get(i));
        }
        ArrayList<String> wholeCatalog = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            wholeCatalog.add(items.get(i) + prices.get(i) + monthlyPayment.get(i));
        }
        System.out.println(wholeCatalog);
        //Task:3
        //String item="iPhone 6s"
        //LOOK FOR THE ITEM IN ITEMS LIST, THEN PRINT OUT.
        //iPhone 6s|449.0|18.71
        String item2 = "iPhone 6s";
        if (items.contains(item2)) {
            int index = items.indexOf(item2);
            System.out.println(item2 + " | " + prices.get(index) + " | " + monthlyPayment.get(index));
        } else {
            System.out.println("Not found");
        }
        //Task4:
        //change price ThumbDrive price
        String product = "ThumbDrive";
        double newPrice = 45.99;
        int ind = 0;
        if (items.contains(product)) {
            ind = items.indexOf(product);
            prices.set(ind, newPrice);
            monthlyPayment.set(ind, newPrice / 18);
            System.out.println(items.get(ind) + " new price is: " + prices.get(ind));
            System.out.println("New Monthly price is: " + monthlyPayment.get(ind));
        } else {
            System.out.println(product + " was not found.Keep coding Java");
        }
        //Task5 //delete "ThumbDrive"
        String productToDelete = "ThumbDrive";
        if (items.contains(productToDelete)) {
            int index = items.indexOf(productToDelete);
            items.remove(productToDelete);
            prices.remove(index);
            monthlyPayment.remove(index);
            System.out.println(productToDelete + " is safely removed");
        } else {
            System.out.println(productToDelete + " was not found");
        }
        System.out.println(items.toString() + prices + monthlyPayment);
        //Task6: remove all iPhones.
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).contains("iPhone")) {
                System.out.println("iPhone found at index " + i);
                items.remove(i);
                prices.remove(i);
                monthlyPayment.remove(i);
                i--;//take one index back
                System.out.println(items);
                System.out.println(prices);
                System.out.println(monthlyPayment);
            }
            }
        //Task7 print info products that price is more than 500.
        for(int n=0;n<prices.size();n++){
            if(prices.get(n)>500){
                System.out.println(items.get(n)+" is "+prices.get(n));
            }
            }


        }
}




