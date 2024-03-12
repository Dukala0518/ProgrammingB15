package day_43_constructors_custom_class_list;

public class PetTest {
    public static void main(String[]args){
        Pet dog=new Pet();
        dog.setType("dog");
        dog.setName("Kitto");
        System.out.println(dog.toString());
        Pet cat=new Pet();
        cat.setPetInfo("cat", "Kitty");
        System.out.println(cat.toString());
        dog.speak();
        cat.speak();


    }
}
