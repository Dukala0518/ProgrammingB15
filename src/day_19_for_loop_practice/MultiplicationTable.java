package day_19_for_loop_practice;

public class MultiplicationTable {

    public static void main(String[] args) {
          int num=10;
          if(num<1 || num>10){
              System.out.println("Error");
              return;}

             for(int n=1;n<=10;n++){
                 int result=n*num;
                 System.out.println(n+"*"+num+"="+result);
             }

             
        }  
    }

