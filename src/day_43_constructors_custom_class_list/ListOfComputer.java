package day_43_constructors_custom_class_list;

import java.util.ArrayList;

public class ListOfComputer {
    public static void main(String[] args) {
        //declare list of computers
        ArrayList<computer>compList=new ArrayList<>();
        compList.add(new computer("dell",256.000,"win10"));
        compList.add(new computer("apple",1000,"ios"));
        compList.add(new computer("hp",800,"win9"));

        //task 1:print number of computer
        System.out.println("task1");
        System.out.println("NUMBER OF COMPUTER"+compList.size());

        //task2. print first computer brand and price
        System.out.println("task2");
        System.out.println("First.computer"+compList.get(0).getBrand()+" "+compList.get(0).getPrice());
        //another way
        computer firstComputer=compList.get(0);
        System.out.println(firstComputer.getBrand());

        //task3 using for loop, print number then computer description
        System.out.println("task3");
        for(int i=0;i<compList.size();i++){
            System.out.println(i+1+". "+compList.get(i).toString());
        }

        //task4 using each loop print number and computer description
        System.out.println("task4");
        int counter=0;
        for(computer eachcomp:compList){
            counter++;
            System.out.println(counter+"."+eachcomp.toString());
        }
        //task5 print brand and price for computer within your budget and print brand and price
        System.out.println("task5");
        double myBudget=800.0;
        for(int i=0;i<compList.size();i++){
            if(compList.get(i).getPrice()<myBudget){
                System.out.println(compList.get(i).getBrand());
            }
        }





    }

}
