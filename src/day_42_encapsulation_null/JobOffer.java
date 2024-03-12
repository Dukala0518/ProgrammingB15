package day_42_encapsulation_null;

public class JobOffer {
   private int hourlyPay;
   private String location;

   public int getHourlyPay(){
       return hourlyPay;
   }
    public void setHourlyPay(int newHourlyPay) {
        hourlyPay=newHourlyPay;
    }

    public void setLocation(String newLocation){
      this.location=location;
    }
    public String getLocation(){
       return location;
    }

    public String toString() {
        return "JobOffer{" +
                "hourlyPay=" + hourlyPay +
                ", location='" + location + '\'' +
                '}';
    }
}
