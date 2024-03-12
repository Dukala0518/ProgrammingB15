package day_44_sub_vehicle;

import day_44_static_field.SlackUser;

public class SlackUserSubClass extends SlackUser {
    int adminId;

    public String toString() {
        return "SlackUserSubClass{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    public static void main(String[] args) {
        SlackUserSubClass user1=new SlackUserSubClass(123456789,"Duka",2028805393);
        user1.sendMessage();
        user1.callSomeone();
        user1.toString();
    }
    public SlackUserSubClass(int adminId, String name, int phone){
        this.adminId=adminId;
        this.name=name;
        this.phone=phone;

    }

}
