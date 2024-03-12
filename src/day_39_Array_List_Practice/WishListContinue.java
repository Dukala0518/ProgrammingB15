package day_39_Array_List_Practice;
import java.util.ArrayList;
public class WishListContinue {
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

        //Task8:Find out most expensive item and print out details
        double mostExpensive=0;
        int index=0;
        for(int i=0;i<prices.size();i++){
            if(prices.get(i)>mostExpensive){
                mostExpensive=prices.get(i);
                index=prices.indexOf(mostExpensive);
            }
        }
        System.out.println("The most expensive product is: "+items.get(index)+" and price is: "+prices.get(index));
        //Task9: find out cheapest product and print out the info.
        int indexOfCheapest=0;
        for(int i=0;i<prices.size();i++){
                if(prices.get(i)<prices.get(indexOfCheapest)){
                    indexOfCheapest=i;
                }
            }
        System.out.println("The cheapest product is: "+items.get(indexOfCheapest)+" and price is: "+prices.get(indexOfCheapest));


}}

