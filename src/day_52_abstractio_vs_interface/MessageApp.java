package day_52_abstractio_vs_interface;

public abstract class MessageApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static final String APP_TYPE="Messenger";

    public MessageApp(){
        System.out.println("Message app-no argument constructor");
    }


    //abstract method
   public abstract void sendMessage(String msg);

   //non-abstract method
    public void launch(){
        System.out.println("App is launching");
    }
    //static method
    public static void close(){
        System.out.println("Message App is closing");
    }

}
