package day_57_exception_handling_2;

public class RunTimeErrorDemo {
    static int num=0;
    public static void main(String[] args){
        num++;
        System.out.println("num= "+num);

        //call main method again
        //main(null);

    }
}
