package day_35_methods_with_array;

public class ApartmentLease {
    public static void main( String [] Args){
        applyApartment(770);
        applyApartment(650);
        applyApartment(649);
        applyApartment(880);
    }
    public static void applyApartment(int creditScore){
        if(creditScore<=850 && creditScore>=650){
           quality();
        } else if(creditScore<650){
           notQualified();
        } else{
            notQualified();
        }
    }
    public static void quality(){
        System.out.println("Congratulations you are qualified!");
    }
    public static void notQualified(){
        System.out.println("Unfortunately you are not qualified!");
    }

}
