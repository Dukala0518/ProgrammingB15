package day12_ternary_string_manipulation;

public class Cafe {
    public static void main(String[] args) {
        String order="food";
        String drink="";
        String food="soup";
        double price=0;
        if(order.equals("drink")&&drink.equals("soda")){
            price=1.99;
        } else if(order.equals("drink")&& drink.equals("coffee")){
            price=4.99;
        } else if(order.equals("drink")&& drink.equals("water")) {
            price = 0.99;
        }else if(order.equals("food")&&food.equals("soup")){
            price=4.00;
            } else if(order.equals("food")&&food.equals("sandwich")){
            price=5.99;
        }else if(order.equals("food")&&food.equals("salad")){
            price=9.99;
        }
        System.out.println("Your total is "+price);
         {

        }
    }
}
