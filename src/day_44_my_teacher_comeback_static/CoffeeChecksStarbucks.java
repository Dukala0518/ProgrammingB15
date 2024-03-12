package day_44_my_teacher_comeback_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeChecksStarbucks {
    public static void drinkCoffee(Coffee coffeeObj){
        System.out.println("Drinking "+coffeeObj.getName()+" and coding java "+coffeeObj.getPrice());
    }
    //it returns coffee object
    public static Coffee orderCoffee(String coffeeName, String coffeeSize){
        System.out.println("Preparing "+coffeeSize+" "+coffeeName);
        Coffee readyCoffee=new Coffee(coffeeName,coffeeSize,0.99);
        return readyCoffee;
    }


    public static void main(String[] args) {
        Coffee cappuccino =new Coffee("cappuccino","venti",4.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());
        drinkCoffee(cappuccino);

        //syntax for array of Coffees
        Coffee[] coffeeArrays=new Coffee[2];
        coffeeArrays[0]=cappuccino;
        coffeeArrays[1]=new Coffee("latte","venti",3.99);
        System.out.println(Arrays.toString(coffeeArrays));

        //syntax for arrayList of Coffees
        ArrayList<Coffee>coffeeArrayList=new ArrayList<>();
        coffeeArrayList.add(cappuccino);
        coffeeArrayList.add(coffeeArrays[1]);
        coffeeArrayList.add(new Coffee("americano","grande",2.99));
        System.out.println(coffeeArrayList.toString());

        //drink first coffee
        coffeeArrayList.get(0).drink();

        //drink all of them
        for (int i = 0; i < coffeeArrayList.size(); i++) {
            coffeeArrayList.get(i).drink();

        }
        System.out.println("------------");
        drinkCoffee(cappuccino);
        Coffee hotChocolate=new Coffee("Hot chocolate","grande",5.99);
        drinkCoffee(hotChocolate);
        drinkCoffee(new Coffee("iced coffee","grande",3.99));
        System.out.println("---CALL ORDER COFFEE METHOD-----");
         Coffee myCoffee=orderCoffee("White Mocha","grande");
        myCoffee.drink();
        System.out.println(myCoffee);

        }



    }





