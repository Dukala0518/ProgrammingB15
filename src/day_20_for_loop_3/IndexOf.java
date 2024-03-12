package day_20_for_loop_3;

public class IndexOf {
    public static void main(String[] args){
        String word="Java is fun";
        //convert everything to lower case
        int index=-1;//assume not there and assign -1
                     //position of letter-assume not there
        word=word.toLowerCase();
        char letter=' ';
        //loop from first character to last character
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==letter){
                index=i;
                System.out.println(letter+" found at "+i);
                break;//don't check rest of the character (exit the loop)

            }

        }
        System.out.println(letter+" was found at "+index);









    }
}
