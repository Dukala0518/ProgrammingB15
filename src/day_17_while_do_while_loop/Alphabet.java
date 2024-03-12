package day_17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {

       char letter='a'; //letter 'a'--->97
          letter++;
          letter++;
         System.out.println(letter);
        while(letter<='z'){
            System.out.print(letter+" ");
            letter++;
        } char reversed='z';
        while(reversed>='a'){
            System.out.print(reversed+" ");
            reversed--;
        }
        String letters = "";
        char l = 'A';
        letters = letters + l;
        System.out.println(letters);

        char myLetter='A';
        String alphabet="";
        while(myLetter<='Z'){
            alphabet=alphabet+myLetter;
            System.out.println(alphabet);
            myLetter++;
        }

    }
}


