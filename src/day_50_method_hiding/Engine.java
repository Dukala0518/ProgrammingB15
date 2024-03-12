package day_50_method_hiding;

public class Engine {
    private String name;
    private int horsePower;

    public Engine(String name, int horsePower){
        this.name=name;
        this.horsePower=horsePower;
    }
    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
