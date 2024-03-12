package day_47_inheritance_access_modifier;

public class BookTest {
    public static void main(String[] args) {
        Book book=new Book();
        book.setAuthor("Nathan");
        book.setPrice(11.67);
        book.setTitle("Learn Java in One Day");
        book.setType("Coding");
        System.out.println("----Book Info----");
        System.out.println("Author is: "+book.getAuthor());
        System.out.println("Title is: "+book.getTitle());
        System.out.println("Price is: "+book.getPrice());
        System.out.println("Type is: "+book.getType());

        AudioBook audioBook=new AudioBook();
        audioBook.setAuthor("Mario Fusco");
        audioBook.setTitle("Java 8 in action");
        audioBook.setPrice(9.99);
        audioBook.setType("Programming");
        audioBook.setLength(4);
        audioBook.setNarrator("Mario");
        System.out.println("----Audio Book Info----");
        System.out.println("Author is: "+audioBook.getAuthor());
        System.out.println("Title is: "+audioBook.getTitle());
        System.out.println("Price is: "+audioBook.getPrice());
        System.out.println("Type is: "+audioBook.getType());
        System.out.println("Length is: "+audioBook.getLength());
        System.out.println("Narrator is: "+audioBook.getNarrator());
        audioBook.Listen();
        /*
        PUBLIC--->
           VISIBLE TO WORLD/VISIBLE TO ALL CLASSES IN SOME PROJECT. VISIBLE TO ALL
           SUBCLASSES AND NON-SUBCLASSES
           WHENEVER WE WANT TO THE VARIABLE TO BE USED BY ANY CLASSES IN THE PROJECT
           WE DON'T NEED TO DO ANY OF DATA HADING AND PROTECT.

        PROTECTED--->
           VISIBLE TO EVERYONE IN SAME PACKAGE, AND VISIBLE TO ONLY SUBCLASSES IN OTHER PACKAGES.
        DEFAULT--->
           PACKAGE-PRIVATE
           VISIBLE TO ALL CLASSES IN SAME PACKAGE. NOT VISIBLE TO ANY ONE IN OTHER PACKAGES.
        PRIVATE--->
           VISIBLE TO ONLY IN SAME CLASS, NOWHERE ELSE
           WE USE PRIVATE WHEN WE WANT TO PROTECT OUR DATA. IF DATA HAS REQUIREMENTS TO BE VALID
          THEN WE CAN SPECIFY THOSE IN THE SETTER METHODS.

          WHAT IS INHERITED?
          EVERYTHING  PUBLIC IS ALWAYS INHERITED
          ANYTHING PRIVATE IS NEVER INHERITED
          ANYTHING PROTECTED IS ALSO INHERITED TO SUBCLASS
          IF VARIABLE IS DEFAULT ONLY INHERITED TO SUBCLASS IN SAME PACKAGE




        */






    }
}
