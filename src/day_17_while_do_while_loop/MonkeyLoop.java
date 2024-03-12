package day_17_while_do_while_loop;

public class MonkeyLoop {
    public static void main(String[] args) {
        int monkey=5;
        while (monkey>=1){
            if(monkey==1){
                System.out.println(monkey+" monkey jumping on the bed");
            } else
                System.out.println(monkey+" monkeys jumping on the bed");
            monkey--;
        }
        System.out.println("no more monkeys jumping on the bed");
    }
}
