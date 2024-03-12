package day_27_arrays_practice;

public class EncryptionWords {
    public static void main(String[] args) {
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        String al="zyxwvutsrqponmlkjihgfedcba";

        //assign a new word and encrypt each letter using loop
        String word="dukala";
        String encryptedWord="";
        for(int i=0; i<word.length();i++){
            //read a letter from word index i
            char myLetter=word.charAt(i);
           // System.out.print(myLetter);
            //find the index of myLetter in alphabet
            int index=alphabet.indexOf(myLetter);
            char enc=al.charAt(index);
            encryptedWord += enc;
            }
        System.out.println(encryptedWord);
//        /Task3-----------------------------------
            String word2="happybirthday";
            String word3="";
            for(int i=0;i<word2.length();i++){
                char wordChar=word2.charAt(i);
                int indexOf=al.indexOf(wordChar);
                char a=alphabet.charAt(indexOf);
                //word3=word3+a;
                word3= word3+a;
            }
        System.out.println(word3+"-->"+word2);

        }

            }








