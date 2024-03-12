package day_42_encapsulation_null;

public class Person {
    //name should not be empty
    //age can only be between 0-130
    private String name;
    private int age;
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    } //for name read only
    //getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge>=0 && newAge<=120){
            age=newAge;
        }else{
            System.out.println("Error");
        }
    }

    //setter-write only
    public void setName(String newName){
        if(!newName.isEmpty()){
            name=newName;
        }else{
            System.out.println("Error, name can not be empty");
        }

    }

}
