package day_43_constructors_custom_class_list;

public class CatTest {
    public static void main(String []args){
        Cat luna=new Cat();
        Cat mimi=new Cat();
        System.out.println(luna.getName());
        System.out.println(mimi.getName());
        Cat bella=new Cat("Bella");
        System.out.println(bella.getName());
    }
}
