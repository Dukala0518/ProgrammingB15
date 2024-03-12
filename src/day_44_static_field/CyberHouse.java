package day_44_static_field;

public class CyberHouse {
    int houseNum;
    String design;
    private static String neighbourhoodName="Cybertek Ave";
    public CyberHouse(int houseNum,String design){
        this.houseNum=houseNum;
        this.design=design;

    }
    public void displayInfo() {
        System.out.println(houseNum + " " + design + " " + neighbourhoodName);
    }
    public static void showNeighbourhood(){
        System.out.println(neighbourhoodName);
    }


        }


