package day_53_polymorhism_intro;

import day_47_inheritance_access_modifier.App;

public class Test {
    public static void main(String[] args) {
        AppleWatch appleWatch=new AppleWatch();
        appleWatch.name="Apple watch";
        appleWatch.series=7;
        appleWatch.countStep();
        appleWatch.use();
        appleWatch.wear();
        iPhone iPhone=new iPhone();
        iPhone.name="iPhone";
        iPhone.model=14;
        iPhone.navigate();
        iPhone.use();
        iPhone.code();
        iPhone.wear();
        MacBookPro macBookPro=new MacBookPro();
        macBookPro.name="Macbook pro";
        macBookPro.use();
        macBookPro.code();



    }
}
