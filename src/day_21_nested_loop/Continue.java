package day_21_nested_loop;

public class Continue {
    public static void main(String[] args) {
       String name="Dulamsuren";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='u'){
                continue;
            }
            System.out.println(name.charAt(i));

        }
    }
}
