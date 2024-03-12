package day_21_nested_loop;

public class Multiplication {
    public static void main(String[] args) {
        //1*1=1
        //1*2=2
        //1*3=3
        //1*4=4
        //1*5=5


        for(int num=1; num<=10;num++){
            System.out.println("\nTABLE FOR#"+num);    //    \n is newline
            System.out.println("------------");
        for(int i=1; i<=10;i++){
            int result=num*i;
            System.out.println(num+" * "+i+" ="+result);

        }
            System.out.println(" ");
        }


    }
}
