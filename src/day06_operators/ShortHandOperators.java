package day06_operators;

public class ShortHandOperators {
    public static void main(String[] args){
        int cars=15;
        System.out.println("Cars in parking:"+cars);
        cars+=2;
        System.out.println("Cars in parking:"+cars);
        cars+=3;
        System.out.println("Cars in parking:"+cars);
        cars=cars+3-5+7;
        System.out.println("Cars in parking:"+cars);
        cars=cars-1;
        System.out.println("Cars in parking:"+cars);
        cars-=2;
        System.out.println("Cars in parking:"+cars);
        cars*=3;
        System.out.println("Cars in parking:"+cars);
        cars/=3;
        System.out.println("Cars in parking:"+cars);
        String apple="b";
        apple+="a";
        System.out.println(apple);
        int apples=10;
                apples%=3;
        System.out.println(apples);

    }
}
