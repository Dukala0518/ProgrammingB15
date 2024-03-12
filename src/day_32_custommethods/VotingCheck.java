package day_32_custommethods;

public class VotingCheck {
    public static void main(String[] args) {
        checkIfCanVote(18);
        printAge(1992);
    }
    public static void checkIfCanVote(int age){
        if(age>=18){
            System.out.println("You are "+age+" years old and eligible to vote!");
        } else{
            System.out.println("You are "+age+" not eligible to vote!");
        }


        }public static void printAge (int birthYear) {
        int currentYear=2023;
        int age=currentYear-birthYear;
        if(birthYear<=0|| birthYear>currentYear){
            System.out.println("Error");
        }else{
            System.out.println("You are "+age+" years old!");


        }


        }

    }

