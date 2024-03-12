package day_43_constructors_custom_class_list;

import day_16_memory_while_loop_intro.StringPool;

public class computerTest {
    public static void main(String[] args) {
        computer dell=new computer("Dell",800.0,"windows 10 pro");



        //array for string object
        String[] names=new String[3];
        names[0]="java";
        names[1]="simba";
        names[2]="calamba";

        //array for computers(shorter way)
        computer[] compArr=new computer[3];
        compArr[0]=new computer("HP",219,"windows 10");
        System.out.println(compArr[0].getBrand());

        //array for computers(longer way)
        computer hp=new computer("DEll", 1000,"ois");
        compArr[1]=hp;
        compArr[2]=new computer("Macbook pro",1000,"os catalina");

        //call to string methods to for all 3

        System.out.println(compArr[0].toString());
        System.out.println(compArr[1].toString());
        System.out.println(compArr[2].toString());

        //print each brand
        for(computer eachCom:compArr){
            System.out.println(eachCom.getBrand());

        }







    }

}
