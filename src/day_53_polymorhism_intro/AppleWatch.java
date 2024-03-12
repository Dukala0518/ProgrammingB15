package day_53_polymorhism_intro;

public class AppleWatch extends AppleDevice implements Wearable {
    int series;
    public void countStep(){
        System.out.println("My apple watch counting my steps...");
    }
    public void use(){
         System.out.println("I use "+ name+" "+series);
     }
    public void wear(){
        System.out.println("I am wearing "+name+" "+series);

    }
}
