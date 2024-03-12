package day_50_method_hiding;
/*
when a super class has private variables, subclasses can assign data to
those variables using
-super(data)-by calling super class constructor
-setData-by calling public setter method

When creating object from a class that has private variables, we can use:
this.varName=varName;
setValue(value);---or we can call setter method
Setter method is preferred when you have condition

*/
public class CapitalCity extends City{
    private String country;
    private long population;
    public int count;//HIDDEN VARIABLE

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public CapitalCity(String name, String country, long population) {
        super(name);
        this.population = population;
        this.country=country;
    }
    public CapitalCity() {
        country = "undefined";
        population = 0;

    }
    @Override
    public String toString(){
        return super.toString()+ " country= "+country+", population= "+population;
        //return "name= "+getName()+ "country= "+country+", population= "+population;
    }
    //method hiding
    public static void buildARoad(){
        System.out.println("Capital city-building a road");
    }
    public void buildingInCity(){
        System.out.println("City-building a road non-static");
        buildARoad();

    }


}
