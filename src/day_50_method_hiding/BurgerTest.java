package day_50_method_hiding;
import java.util.*;
public class BurgerTest {
    public static void main(String[] args) {
        List<Ingredients>ingredients=new ArrayList<>();
        ingredients.add(new Ingredients("onion crisps",7));
        ingredients.add(new Ingredients("american cheese",8));
        ingredients.add(new Ingredients("pickles",7));
        ingredients.add(new Ingredients("lettuce",6));
        ingredients.add(new Ingredients("sauce",9));

        Burger cowboyBurger=new Burger("CowBoy",ingredients);
        System.out.println(cowboyBurger.toString());
    }
}
