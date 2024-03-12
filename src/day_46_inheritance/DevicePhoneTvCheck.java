package day_46_inheritance;

public class DevicePhoneTvCheck {
    public static void main(String[] args) {
        Device d1=new Device();
        d1.brand="Samsung";
        d1.price=1500;
        d1.Use();
        Phone iphone=new Phone();
        iphone.brand="Apple";
        iphone.price=999;
        iphone.carrier="ATT";
        iphone.Use();
        SmartPhone sp=new SmartPhone();
        sp.brand="Samsung";
        sp.carrier="Att";
        sp.price=799;
        sp.name="Samsung ";
        sp.Use();

    }
}
