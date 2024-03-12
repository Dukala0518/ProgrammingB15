package day_47_inheritance_access_modifier;

public class SlackAdminUser extends SlackUser{
    int AdminId;
    public void sendAtChannelMessage(String msj){
        System.out.println("Slack Admin "+name+" is sending @channel msj "+msj);
    }
    public void deleteMessage(){
        System.out.println("Slack Admin ["+name+"] +is deleting Message");
    }
}
