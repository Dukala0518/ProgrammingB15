package day_18_for_loop;

public class StarsEnds {
    public static void main(String[] args) {
        int start=23;
        int end=21;
         if(start<end){
             for(int i=start; start<=end; start++){
                 System.out.println(start);
             }
         } else{
             for(int i=start; start>=end; start--){
                 System.out.println(start);
             }
         }
    }
}
