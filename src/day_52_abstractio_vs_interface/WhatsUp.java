package day_52_abstractio_vs_interface;

public class WhatsUp extends MessageApp implements VoiceCall,VideoCall {

    public void sendMessage(String msg) {
        System.out.println("Sending message" + msg);
    }

    public void call(String contact) {
        System.out.println("Calling to " + contact);
    }
    public void shareScreen(){
        System.out.println("Sharing screen");

    }
    public void videoCall(){
        System.out.println("VideoCalling");
    }

    public static void main(String[] args) {
        WhatsUp whatsUp = new WhatsUp();
        whatsUp.isFree=true;
        whatsUp.allOSCompatible=true;
        whatsUp.name="Whats Upp";
        whatsUp.sendMessage("I love you");
        whatsUp.launch();
        MessageApp.close();
        whatsUp.call("Duka");
        whatsUp.accept();
        VoiceCall.decline();
        whatsUp.shareScreen();
        whatsUp.videoCall();
        System.out.println(VoiceCall.CAN_CALL);
    }
//static method is shared within the class
    // static is used in the static


}
