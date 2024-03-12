package day_51_abstraction.Student;

public class CampusStudent extends Student{
    public void attendClass(){
        System.out.println("Campus day_51_abstraction.Student attending");
    }
    @Override
    public void code(String language){
        System.out.println("Campus day_51_abstraction.Student is coding "+language);
    }
    public void playPingPong(){
        System.out.println("Campus student is playing ping pong...");
    }

}
