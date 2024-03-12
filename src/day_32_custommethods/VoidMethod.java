package day_32_custommethods;

public class VoidMethod {
    public static void main(String[] args) {
     countFrom1to10();
     printAtoZ();
     iCanDoIt();
     displayUSFlag();
    }
    public static void countFrom1to10(){
        //it prints 1-10 numbers in same line separated by space
        for(int i=1;i<=10;i++){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void printAtoZ(){
        //it prints all letters A-Z in uppercase separated by space
        for(char letter='A';letter<='Z';letter++){
            System.out.print(letter+"\t");
        }
        System.out.println();
    }
    public static void iCanDoIt(){
        //it prints below message 300 times in same line separated by"|"
        //Java is fun-I can do that!
        for(int i=0;i<=30;i++){
            System.out.print("Java is fun-I can do that!"+"|");
        }
        System.out.println();
    }
    public static void displayUSFlag(){
        //it prints US flag pattern
        String p1="*********========================";
        String p2="=================================";
        for(int i=1;i<4;i++){
            System.out.println(p1);
        }
        for(int i=0;i<4;i++){
            System.out.println(p2);
        }
    }


}
