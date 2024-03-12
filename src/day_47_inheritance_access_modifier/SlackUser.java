package day_47_inheritance_access_modifier;

public class SlackUser {
    String name;
    String status;
     public void sendMessage(String message){
         System.out.println("Slack user "+name+" is typing .... "+message);
     }
     public void callSomeone(){
         System.out.println("Slack user "+name+" is calling");
     }
     public void addEmoji(String Emoji){
         System.out.println("Slack user "+name+" is adding emoji "+Emoji);

     }
}
