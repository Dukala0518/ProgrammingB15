package day09_multibranch_switch;

public class Citizens {
    public static void main(String[] args){
        String citizenType="";
        int age=37;
        if(age>=65){
            citizenType="Senior";
        }else{
            citizenType="Non Senior";
        }
        System.out.println("Citizen type is "+citizenType);
    }
}
