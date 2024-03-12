package day_18_for_loop;

public class ForLoop {
      /* note:
  while loop:
      ---> repeats block of code, as long as boolean condition is true
      when to use:
      --->use this loop when you are not sure how many times the loop will execute.
      For ex:
      keep looking until user enters even number
      For ex:
      keep looking until users enters correct number
  do while loop
       --->runs the loop block codd once then checks the boolean condition,it will keep repeating the block of code as long as
       condition is true. this look guarantees that code in the loop block will execute at least once
       when to use:
       --->in situation where your code should once then base on the condition should repeat or no.
       For ex: simple games when user needs to do some action first then check condition.
       --->not so popular in test automation
  for loop   /while loop also can do that/
       --->it will keep repeating the block og code as long as condition is true.
       when to use it:
       --->when we know the iteration count.
       For ex: say "good morning" 100 times.
      */

  //ex:   Print 1 to 5 using loop.
  public static void main(String[] args) {
      int n=1;
      while(n<=5){
          System.out.println(n);
          n++;
      }
      // Print 1 to 5 using for loop.
      for(int n1=1; n1<=5;n1++){
          System.out.println(n1);
      }
    // note:-------->
      //1.

  }
}



