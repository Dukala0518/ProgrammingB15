package day11_string_comparison_logical;

public class StringEquals {
    public static void main(String[] args) {
        String str="java";
        String str2= "java";
        //System.out.println(str=="java");
        //System.out.println(str2=="java");
        System.out.println(true);
        System.out.println(true);
        System.out.println(str2.equals("java"));
        System.out.println(str.equalsIgnoreCase("Java"));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str==str2);
    }
}
