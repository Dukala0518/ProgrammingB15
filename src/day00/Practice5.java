package day00;

public class Practice5 {
    public static void main(String[] args) {
        System.out.println(check("i love bob"));
    }
    public static boolean check(String str){
        boolean xo=false;
        for(int i=0;i<str.length()-2;i++){
            String word = "";
            word = str.substring(i,i+3);
            if(word.charAt(0)=='b' && word.charAt(2)=='b'){
                xo=true;
            }else{
                xo=false;
            }
        }
        return xo;
    }
}
