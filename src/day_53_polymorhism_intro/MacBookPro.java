package day_53_polymorhism_intro;

public class MacBookPro extends AppleDevice implements Codeable {
     void use(){
         System.out.println("I have "+name);
     }
    public void code(){
        System.out.println("I code on my "+name);
    }

}
