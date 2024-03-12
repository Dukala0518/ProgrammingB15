package day_45_sataic_keyword;

public class DinnerTest {
    public static void main(String[] args) {
        Dinner Mom=new Dinner();
        Dinner Dad=new Dinner();
        Dinner Kid=new Dinner();
       // System.out.println(Dinner.pizzaSlices);
        Mom.takeASlice(1);
        Dad.takeASlice(2);
        Kid.takeASlice(2);
       // System.out.println(Dinner.pizzaSlices);
        System.out.println("Kid: "+Kid.pizzaSlices);
        System.out.println("Mom: "+Mom.pizzaSlices);
        System.out.println("Dad: "+Dad.pizzaSlices);

        Mom.takeASlice();
        Dad.takeASlice();
        Kid.takeASlice();
       // System.out.println(Dinner.pizzaSlices);
        System.out.println("Kid: "+Kid.pizzaSlices);
        System.out.println("Mom: "+Mom.pizzaSlices);
        System.out.println("Dad: "+Dad.pizzaSlices);

        Dad.pizzaSlices=8;
       // System.out.println(Dinner.pizzaSlices);
        System.out.println("Kid: "+Kid.pizzaSlices);
        System.out.println("Mom: "+Mom.pizzaSlices);
        System.out.println("Dad: "+Dad.pizzaSlices);


    }
}
