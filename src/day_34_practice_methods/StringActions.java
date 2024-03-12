package day_34_practice_methods;

public class StringActions {
    public static void main(String[] args) {
        System.out.println(countWords("Helloooooo",'o'));
        System.out.println(countWords("Dulamsuren",'a'));
        int countOfChars=countWords("Dulamsuren",'X');
        System.out.println(countOfChars);

    } public static int countWords(String word,char ch){
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }



}