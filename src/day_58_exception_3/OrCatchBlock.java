package day_58_exception_3;

public class OrCatchBlock {
    public static void main(String[] args) {
        String str="java";
        try{
            System.out.println("in try block");
            System.out.println(str.charAt(0));
            String str2=null;
            System.out.println(str2.toUpperCase());
        }catch(StringIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Exceptions caught");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
    }


}
