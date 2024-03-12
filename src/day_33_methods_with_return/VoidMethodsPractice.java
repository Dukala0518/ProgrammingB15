package day_33_methods_with_return;

import java.util.Locale;

public class VoidMethodsPractice {
    public static void main(String[] args) {
        printDay(5);
        printDay(7);
        buildEmail("Dulamsuren Begzsuren", "Apple");
        buildEmail("Bilguun Amarsaikhan", "CGI");
        checkEligible(770);
        int[]scores={550,700,570};
        checkEligible(scores[0]);
        //try with each loop
        for(int each:scores){
            checkEligible(each);
         //try with for each loop
            for(int i=0;i<=2;i++){
                checkEligible(scores[i]);
            }
        }

    }
    public static void printDay(int day) {
        switch (day) {
            case 1:
                System.out.println("day--> " + day + " Monday");
                break;

            case 2:
                System.out.println("day--> " + day + " Tuesday");
                break;

            case 3:
                System.out.println("day--> " + day + " Wednesday");
                break;

            case 4:
                System.out.println("day--> " + day + " Thursday");
                break;

            case 5:
                System.out.println("day--> " + day + " Friday");
                break;

            case 6:
                System.out.println("day--> " + day + " Saturday");
                break;

            case 7:
                System.out.println("day--> " + day + " Sunday");
                break;
                default:
                    System.out.println("ERROR");
            }
            {
            }
        }
        public static void buildEmail(String name, String company){
        //remove all spaces from name and company
            //build email
            //print
            name=name.replace(" ","");
            company=company.replace(" ","");
            String email=name.toLowerCase()+"@"+company.toLowerCase()+".com";
            System.out.println(email);
        }
        public static void checkEligible(int creditScore){
        if(creditScore>=640){
            System.out.println("You are eligible for loan");
        }else{
            System.out.println("You are not eligible");
        }

        }
    }
