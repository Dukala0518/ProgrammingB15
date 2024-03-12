package day_36_wrapper;

public class CharacterClass {
    public static void main(String[] args) {
        //Character class is a wrapper class for char. and it provides many useful methods.
        /*
        Character.isDigit
        Character.isLetter
        Character.isLetterOrDigit
        Character.isLowercase
        Character.isUppercase
         */
        char ch1='a';
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLowerCase(ch1));
        System.out.println(Character.isAlphabetic(ch1));

        char ch2='5';
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.isLetter(ch2));

        char ch3='%';
        System.out.println(Character.isDigit(ch3));
        System.out.println(Character.isLetter(ch3));
        System.out.println(Character.isLetterOrDigit(ch3));
        System.out.println(!Character.isLetterOrDigit(ch3));

        char ch4=' ';
        System.out.println(Character.isWhitespace(ch4));
        String firstName="John";
        //test if firstname start with uppercase letter
        if(Character.isUpperCase(firstName.charAt(0))){
            System.out.println("Pass:First name starts with uppercase");
        }else{
            System.out.println("Fail:First name does not starts with uppercase");
        }



    }
}
