package day_16_memory_while_loop_intro;

public class SmsMessage {
    public static void main(String[] args) {

        String message="Sender:[Dukala], From Number<555>,Message:{Lets drink some coffee}";
        int sender=message.indexOf("[");
        int sender1=message.indexOf("]");
        int number=message.indexOf("<");
        int number1=message.indexOf(">");
        int txt=message.indexOf("{");
        int text1=message.indexOf("}");
        String Sender=message.substring(sender,sender1+1);
        String Number=message.substring(number,number1+1);
        String Text=message.substring(txt,text1+1);
        System.out.println(Sender+Number+Text);








    }

}
