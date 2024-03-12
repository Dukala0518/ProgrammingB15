package day11_string_comparison_logical;

public class LoginTest {
    public static void main(String[] args) {
        String userName="Dukala0518";
        String password="Janjan2350!";
        if (userName.equalsIgnoreCase("Dukala0518")&&password.equals("Janjan2350!")){
            System.out.println("Succesfull");
        }  else if(userName.equalsIgnoreCase("Dukala0518")&& !password.equals("Janjan2350!")){
            System.out.println("Invalid");
        } else if (! userName.equalsIgnoreCase("Dukala0518")&& password.equals("Janjan2350!")){
            System.out.println("Try again");
        }

        }

    }

