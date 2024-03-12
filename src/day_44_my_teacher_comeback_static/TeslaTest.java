package day_44_my_teacher_comeback_static;

public class TeslaTest {
    public static void purchaseCar(Tesla teslaObj){
        System.out.println("Purchasing "+teslaObj.getModel());

    }

    public static Tesla testDrive(String modelName){
        System.out.println("I would like to drive "+modelName);
        Tesla readyTesla=new Tesla(modelName);
        return readyTesla;
    }

    public static void main(String[] args) {
        Tesla model3=new Tesla("model3");
        purchaseCar(model3);
        purchaseCar(new Tesla("tesla4"));
        Tesla S =testDrive("Model S");
        Tesla cyber =testDrive("Cybertruck");
        purchaseCar(S);


    }
}
