package day_36_wrapper;

public class ExtractNumbersFromString {
    public static void main(String[] args) {
        //Declare string str="java123is45fun0";
        //Print all numbers from str

        String str="java123is45fun0";
        String numbers="";
        String letter="";
        for(int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                numbers=numbers+str.charAt(i);
            }else{
                letter=letter+str.charAt(i);
            }

        }
        System.out.println(numbers);
        System.out.println(letter);

    }

    public static class wrapper_class {
        public static void main(String[] args) {
            //************Wrapper class****************
            //Java is object oriented language.
            //and primitives are not object.They don't
            //behaviour, they are just single piece of data memory.
            //A lot of times, we need to be able to treat primitives as an object.
            //We need to be able to convert primitives to object.
            //So address that, in java there are Wrapper class.
            //boolean, char,byte,short,int long float, double
            //Wrapper classes for each primitive:
            //Boolean, character,byte,short,integer,long,float,double
            //Their purpose is:convert primitive to object.
            //Besides that each wrapper class has useful methods as well.
            //Why not use only wrapper classes??
            //wrapper class objects use much more memory and we should use  them when necessary
            //primitives use less space and faster,
        }
    }
}
