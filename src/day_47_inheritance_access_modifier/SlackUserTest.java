package day_47_inheritance_access_modifier;

public class SlackUserTest {
    public static void main(String []args){
        SlackUser user1=new SlackUser();
        user1.name="Bill";
        user1.status="User";
        user1.sendMessage("I love Duka");
        user1.callSomeone();
        user1.addEmoji(":-)");
        SlackAdminUser admin1=new SlackAdminUser();
        admin1.name="Duka";
        admin1.status="Admin";
        admin1.AdminId=2350;
        admin1.callSomeone();
        admin1.sendMessage("I love Bill");
        admin1.addEmoji(":-/");
        admin1.deleteMessage();
        admin1.sendAtChannelMessage("'Thank you'");


    }
}
