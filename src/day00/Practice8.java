package day00;

public class Practice8 {
    public static void main(String[] args) {
        String Bilguun="Bilguun";
        String Duka="Duka";
        String Erdemt="";
        for (int i = 0; i < Duka.length(); i++) {
            Erdemt=Erdemt+Bilguun.charAt(i)+Duka.charAt(i);


        }
        System.out.println(Erdemt);
        System.out.println(mixString("hhh", "aaaAAA"));
    }
    public static String mixString(String a, String b) {
        int aLength=a.length();
        int bLength=b.length();
        int min=0;
        String word="";
        if(aLength>bLength){
            min=bLength;
        }
        if(aLength<bLength){
            min=aLength;
        }
        for (int i = 0; i < min; i++) {
          word+=word+a.charAt(i)+b.charAt(i);
        }
        String tail="";
        if(aLength>bLength){
           tail= a.substring(min);
        }
        if(aLength<bLength){
            tail=b.substring(min);
        }
        word=word+tail;

        return word;

}
}
