package day_32_custommethods;

public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("Hello from main method");
        displayMessage(); //call/use the custom method
        displayMessage();
        System.out.println("Back in main method");
    }

    public static void displayMessage(){
        System.out.println("Hello World from my method!");
    }
}
//Whatever in my method body(within {code}).
//That code will run when you call the method.
//We can call the method multiple times, since it is reusable.