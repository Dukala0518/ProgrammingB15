package day_53_polymorhism_intro;

public class iPhone extends AppleDevice implements Codeable,Wearable{
    int model;
    public void navigate(){
        System.out.println("I can navigate on my "+name+model);
    }
    public void use(){
        System.out.println("I have "+name+"...");
    }
    public void wear(){
        System.out.println("I have beautiful wearable case ");
    }
    public void code(){
        System.out.println("I can code on my "+name);
    }

}
