package day_17_while_do_while_loop;

public class DoWhileLoop {
    //note------> Will execute the block of code, as long as condition is true.Condition is checked at the bottom.
    //            Difference between while loop and do loop:
    //            While loop:condition is on top. It checks condition first then it is true, it will enter loop block.
    //            do while loop: runs the code in the loop block first, then check the condition, if it true repeat, if false
    //            it will execute.So do while loop guarantees that your code will run at least once.
    public static void main(String[] args) {
        //   print 0-10 using do while.
        int n=0;
        do{
            System.out.println(n);
            n++;
        } while(n<=10);
        // print 0-100, every other number like 0,2,4,6....etc
        int n1=0;
        do{
            System.out.print(n1);
            n1=n1+2;
        }while(n1<=100);



    }


}
