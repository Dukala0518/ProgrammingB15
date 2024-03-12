package day_52_abstractio_vs_interface;

interface VoiceCall {
    //public static final variables ONLY;
    boolean CAN_CALL=true;

    //abstract method
    void call(String contact);

    //static method
    static void decline(){
        System.out.println("Duka decline voice call");
    }

    //default method:
    default void accept(){
        System.out.println("Duka accept call finally...");
    }
}
