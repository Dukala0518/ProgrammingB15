package day_42_encapsulation_null;

public class JobOfferTest {
    public static void main(String[] args) {
        JobOffer fannie=new JobOffer();
        fannie.setHourlyPay(55);
        fannie.setLocation("Arlington");
        System.out.println(fannie.toString());
        System.out.println(fannie.getHourlyPay()+" "+fannie.getLocation());
    }
}
