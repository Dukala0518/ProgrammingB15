package day_13_string_manipulation;

public class StringLength {
    public static void main(String[] args) {
        String school="Cybertek School";
        System.out.println(school.length());
        int count=school.length();
        System.out.println(school+" is "+count+" characters ");
        String firstName="Dulamsuren";
        String lastName="Begzsuren";
        int count1=firstName.length()+lastName.length();
        System.out.println(count1);
        String password="Janjan2350";
        if (password.length()>=8){
            System.out.println("Password matches requirement");
        } else{
            System.out.println("Password is too short");
        }
        int pLenght=password.length();
        if(pLenght>=8 && pLenght<=16){
            System.out.println("Password matches requirement");
        } else {
            System.out.println("Password is incorrect");
        }

        }

    }

