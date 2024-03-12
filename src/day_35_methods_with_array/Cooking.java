package day_35_methods_with_array;

import java.util.Arrays;

public class Cooking {
    public static void main(String[] args) {
        System.out.println(".....Scrambled eggs......");
        add("olive oil,eggs,salt,pepper,cheese");
        mix(5);
        fry(1);
        System.out.println(".......Fried chicken......");
        add("butter,chicken,salt,pepper");
        mix(60);
        bake(45);
        scrambledEggsRecipe();

    }
    public static void add(String... items){
        System.out.println("Adding-"+ Arrays.toString(items));
    }
    public  static void mix(int seconds){
        System.out.println("Mix for "+seconds+"seconds");
    }
    public static void boil(int minutes){
        System.out.println("Boil for "+minutes+"minutes");
    }
    public static void fry(int minutes){
        System.out.println("Fry for "+minutes+"minutes");
    }
    public static void bake(int minutes){
        System.out.println("Bake for "+minutes+"minutes");
    }
    public static void scrambledEggsRecipe(){
        System.out.println(".....Scrambled eggs......");
        add("olive oil,eggs,salt,pepper,cheese");
        mix(5);
        fry(1);
        System.out.println(".......Fried chicken......");
        add("butter,chicken,salt,pepper");
        mix(60);
        bake(45);

    }
}
