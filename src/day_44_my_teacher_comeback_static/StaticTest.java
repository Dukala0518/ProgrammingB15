package day_44_my_teacher_comeback_static;

import day_43_constructors_custom_class_list.Cat;

public class StaticTest {
    public static void main(String[] args) {
      //System.out.println(StaticKeyWord.name);
        StaticKeyWord obj=new StaticKeyWord();
        System.out.println(obj.name);
        System.out.println(StaticKeyWord.age);
        System.out.println(Calculator.divide(2, 4));
        Calculator calc=new Calculator();
        System.out.println(calc.plus(2, 5));
        System.out.println(Calculator.divide(3, 6));
        int result=Calculator.divide(10,2);
        System.out.println(result);
        int result1=calc.plus(2,90);
        System.out.println(result1);
        int res=Math.divideExact(6,6);
        System.out.println(res);
        System.out.println(Calculator.minus(10, 9));
        System.out.println(Math.max(4, 9));
        System.out.println(Math.cos(12.2));
        System.out.println(Math.round(12.12));


    }
}
