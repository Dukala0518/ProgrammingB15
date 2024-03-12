package day_50_method_hiding;

public class CityTest {
    public static void main(String[] args) {
        City city=new City("Ulaanbaatar");
        CapitalCity capitalCity=new CapitalCity("Moscow","Russia",143000000000L);
        System.out.println(city.toString());
        System.out.println(capitalCity.toString());
        //static way of calling
        City.buildARoad();
        CapitalCity.buildARoad();
        //call using object
        city.buildARoad();
        capitalCity.buildARoad();

        System.out.println("-------------------------");
        //test method hiding
        CapitalCity astana=new CapitalCity("Astana","Turkey",1299309309L);
        astana.building();//this calls buildARoad which is hidden
        System.out.println("________________________________");
        CapitalCity ankara=new CapitalCity("Ankara","Turkey",1230000L);
ankara.buildingInCity();
        System.out.println("_______________");
ankara.buildARoad();
    }





}
