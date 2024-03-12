package day_30_car_practice;

public class CarInfo {
    public static void main(String [] args) {
        String car = "Mini-Cooper";
        String carArr[] = car.split("-");
        String cooper=carArr[1];
        String mini=carArr[0];
       // System.out.println(cooper);
        String cooperMasked="";
       for(int n=0;n<cooper.length();n++){
           cooperMasked=cooperMasked+"*";

            }
        System.out.println(mini+"-"+cooperMasked);

        }
    }
