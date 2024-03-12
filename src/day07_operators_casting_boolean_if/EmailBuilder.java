package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class EmailBuilder {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       System.out.println("Welcome to your new company!");
       System.out.println("Enter first name, last name, company name");
       String firstName= input.next(),lastName=input.next();
       String companyName=input.next();
       String email=firstName+"_"+lastName+"@"+companyName+".com";
       System.out.println("Your email is: "+email);







    }
}
