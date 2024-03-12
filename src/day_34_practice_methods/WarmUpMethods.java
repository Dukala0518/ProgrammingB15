package day_34_practice_methods;

public class WarmUpMethods {
    public static void main(String[] args) {
login("bchdb","bcdhsb");
    }
    public static void login(String userName,String password){
        String ValidUN="student@cybertek.com";
        String ValidP="cybertek15";
        if(userName==ValidUN && password==ValidP){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login failed");
        }


    }
}
