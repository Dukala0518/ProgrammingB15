package day_32_custommethods;

public class MethodsWithInput {
    public static void main(String[] args) {
displayMessage("Java is fun");
displayMessage("I can do that");
greetByName("Dukala");
greetByName("Bill");
String someName="Erdemt";
greetByName(someName);
count(5);
count(15);
    }
    public static void displayMessage(String message){
        System.out.println("message:"+message);
        message="coding java";
    }
    public static void greetByName(String name){
        System.out.println("Hello, "+name+" ,how are you?");
    }
    public static void count(int num){
        for(int i=0;i<=num;i++){
            System.out.print(i+"\t");
        }

    }
}
