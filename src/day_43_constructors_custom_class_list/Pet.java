package day_43_constructors_custom_class_list;

public class Pet {
    private String name;
    private String type;

    public String getName(){
        return name;
    }
    public void setName (String name){
       this.name=name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
       this.type=type;
    }
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public void setPetInfo(String type, String name){
        this.type=type;
        this.name=name;
    }
    public void speak(){
        System.out.println(name+" is saying");
        switch (type){
            case"dog":
                System.out.println("gav gav");
                break;
            case"cat":
                System.out.println("miaow miaow");
                break;
            case "bird":
                System.out.println("chip chip");
                break;
            case "fish":
                System.out.println("...");
            case"lion":
                System.out.println("roar");
            default:
                System.out.println("java java");

            }
        }
    }

