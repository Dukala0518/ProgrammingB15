package day_51_abstraction.Student;

public class CalambaStudent extends ExchangeStudent{
    @Override
    public void getVisa(){
        System.out.println("Calamba student get visa by attending visa interview");
    }
    @Override
    public void attendClass(){
        System.out.println("Calamba day_51_abstraction.Student -attending class");
    }



}
