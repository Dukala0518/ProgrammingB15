package day_27_arrays_practice;

public class Encryption {
    public static void main(String[] args) {
        //Encryption--->masking every character to something else so that only person with the key
        //can understand.
        String str =      "abcdefghijklmnopqrstuvwxyz";
        String reversed = "zyxwvutsrqponmlkjihgfedcba";
       // String letter = "a";
        //encrypt letter
        //find the index of "a" in alphabet
        //read character at some index from encrypted
        //System.out.println(str.indexOf(letter));
        //int idx=str.indexOf(letter);
        //char Dukala=reversed.charAt(idx);
        //System.out.println(Dukala);

        for(int i=0;i<str.length();i++){
           char letter=str.charAt(i);
            //System.out.println(letter);
            int idx=str.indexOf(letter);
            for(int n=0;n<reversed.length();n++){
               // System.out.println(letter+"-->"+reversed.charAt(idx));

            }System.out.println(letter+"-->"+reversed.charAt(idx));




        }



            }
        }










