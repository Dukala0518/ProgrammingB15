package day12_ternary_string_manipulation;

public class CafeNestedIf {
    public static void main(String[] args) {
        String order = "food";
        String drink = "";
        String food = "soup";
        double price = 0;
        if (order.equals("drink")) {
            if (drink.equals("soda")) {
                price = 2.99;
            } else if (drink.equals("coffee")) {
                price = 3.99;
            } else if (drink.equals("water")) {
                price = 1.99;
            } else {
                System.out.println("invalid");
            }
        } else if (order.equals("food")) {
            {
                if (food.equals("sandwich")) {
                    price = 7.99;
                } else if (food.equals("soup")) {
                    price = 2.99;
                } else if (food.equals("salad")) {
                    price = 9.99;
                } else {
                    System.out.println("invalid");
                }
            }

        }
        System.out.println(price);
    }

}

