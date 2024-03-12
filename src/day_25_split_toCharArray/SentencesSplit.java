package day_25_split_toCharArray;

public class SentencesSplit {
    public static void main(String[] args) {
        String sentences = "Java is fun";
        String[] words=sentences.split(" ");
        for(int i=0;i< words.length;i++){
            System.out.print(words[i]+" ");

        }   System.out.println();
String reversed="";
        for(int i= words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
            reversed+=words[i]+" ";
        }
        System.out.println("reversed is"+reversed);
    }}
