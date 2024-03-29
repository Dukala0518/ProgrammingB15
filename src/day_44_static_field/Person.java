package day_44_static_field;

public class Person {
    //instance field:belong to the instance objects
    //every Person object will get their own name and own age
    //changing the value of one object does not affect another
   private String name;
   private int age;
   //static field: belong to the class
    //there is only one copy of this value ,and it is shared by all objects
    //created out of this Person template / blue print
   public static String species;

   public Person(String name, int age){
       this.name=name;
       this.age=age;
   }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
