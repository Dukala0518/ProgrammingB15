package day_21_nested_loop;
    /* NOTE
    Loop inside the loop
    we can have another loop inside a loop and even more. We can many nested loops
    It is useful when outer loop counter is used in the inner loop depending on requirement.
    All loops including while,do while, for, for each-all of them can have nested loops.*/
public class NestedLoop2 {
    public static void main(String[] args) {
        for(int i=0; i<=7;i++ ){
          for(int n=0; n<=i;n++){
              System.out.print(n+"");
          } System.out.println(i);
        }

    }
}
