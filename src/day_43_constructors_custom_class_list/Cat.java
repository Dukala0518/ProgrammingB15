package day_43_constructors_custom_class_list;

public class Cat {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public Cat(){
        System.out.println("Cat constructor");
        name="unknown";//initializing variable

    }
    //constructor initialize name
    public Cat(String name){
        System.out.println("Cat constructor with name");
        this.name=name;

    }

    }

