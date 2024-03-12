package day_50_method_hiding;

public class City {
  private String name;
  public int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(String name) {
        this.name = name;
    }

    public City() {
        name="undefined";
    }
    @Override
    public String toString(){
        return "name= "+name;
    }
    public  static void buildARoad(){
        System.out.println("City-building a road");

    }
    public void building(){
        System.out.println("City-building a road non-static");
        buildARoad();

    }
}
