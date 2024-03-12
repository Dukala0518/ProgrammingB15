package day_62_collection_4;

public class Test {
    public static void main(String[] args) {
        Cat myCat=new Cat();
        printThing(
  ()-> System.out.println("Meow")
        );

    }


    static void printThing(Printable thing){
        thing.print();
    }
}
