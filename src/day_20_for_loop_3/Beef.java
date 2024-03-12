package day_20_for_loop_3;

public class Beef {
    public static void main(String[] args) {
        String word=new String("jaava is fuun");
         //loop through each character and compare with next character if match print "beef"
       for(int i=0; i<word.length()-1;i++){
           //System.out.println(word.charAt(i)+""+word.charAt(i+1));
           if((word.charAt(i)==word.charAt(i)+1)){
               System.out.println("beep"+word.charAt(i));
           }
       }
    }
}
