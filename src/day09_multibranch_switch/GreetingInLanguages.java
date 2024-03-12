package day09_multibranch_switch;

public class GreetingInLanguages {
    public static void main(String[] args){
        String language="";
        String greeting="";
        int choise=1;
        if(choise==1) {
            language="English";
            greeting="Hello";
        } else if(choise==2){
            language="Spanish";
            greeting="Hola";
        } else if(choise==3){
            language="Japanese";
            greeting="Konnichiwa";
        } else{
            language="Italia";
            greeting="Cia";
        }
        System.out.println("Your language is "+language+" greeting is "+greeting);

    }
}
