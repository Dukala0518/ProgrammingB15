package day_21_nested_loop;

public class for_practice_3 {
    public static void main(String[] args) {
        String str="java is so much fun, java java, python, java spring, let's learn java";
        int javaCount=0;
        for(int i=0; i<str.length()-3;i++){
            String temp=str.substring(i,i+4);
            if(temp.equals("java")){
                System.out.println("java found");
                javaCount++;
            }
        } if(javaCount>0){
            System.out.println(javaCount);
        }
    }
}
