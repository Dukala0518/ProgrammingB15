package day_23_array_practice;
import java.util.Scanner;
public class ArrayWithScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] scores = new int[2];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter team " + (i + 1) + " scores:");
            scores[i] = scan.nextInt();
        }
        //print all scores in one line
//        for (int x : scores) {
//            System.out.print(x + " ");
//        } //find the maximum score
//        int max = 0;
//        for (int i = 0; i < scores.length; i++) {
//            {
//                if (scores[i] > max) {
//                    max = scores[i];
//                }
//        }
//    }System.out.println("max is:" + max);
//        //find minimum!!
//        int min=scores[0]; //------->> assuming first index of number is the smallest one.
//   for(int x:scores){
//       if(min>x){
//           min=x;
//       }
//   }
//        System.out.println("min:"+min);
   //find the average one!!
        int sum = 0;
        double avg = scores.length;
        for (int x:scores){
           //ehleed buh toogoo nem array dotorh
            //garsan toogoo arrayniihaa sizend huvaa
            sum=sum+x;
        }
        System.out.println(sum/avg);
    }


}