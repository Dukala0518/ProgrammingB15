package day_44_static_field;

public class CyberHouseTest {
    public static void main(String[] args) {
        CyberHouse.showNeighbourhood();
        CyberHouse c1=new CyberHouse(101,"vintage");
        c1.displayInfo();
        CyberHouse c2=new CyberHouse(99,"classic");
        c2.displayInfo();
        CyberHouse.showNeighbourhood();

    }
}
