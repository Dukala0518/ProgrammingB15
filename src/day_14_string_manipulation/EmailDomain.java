package day_14_string_manipulation;

public class EmailDomain {
    public static void main(String[] args) {
        String email="employee@gmail.com";
        if(email.contains("gmail")){
            System.out.println("google account");
        } else if(email.contains("yahoo")){
                System.out.println("yahoo account");
        } else if(email.contains("hotmail")){
            System.out.println("hotmail account");
        } else if (email.contains("icloud")){
            System.out.println("apple account");
        } else{
            System.out.println("some other account");
        }

    }
}
