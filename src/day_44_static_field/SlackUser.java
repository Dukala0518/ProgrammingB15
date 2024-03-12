package day_44_static_field;

public class SlackUser {
    protected String name;
    protected int phone;

    public void sendMessage(){
         System.out.println("Slack User is "+name+" sending message");
     }
     public void callSomeone(){
         System.out.println("Slack User is "+name+" calling");
     }

}
