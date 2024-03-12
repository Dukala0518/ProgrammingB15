package day_22_arrays_introduction;

public class SumOfArray {
    public static void main(String[] args) {
        //double[] prices=new double [6];
        double[] prices={99.99,79.99,19.79,75,98.99};
        double totalPrice=0.0;
        for(double each:prices){
            totalPrice=totalPrice+each;
        }
        System.out.println(totalPrice);
        double moreThan50=0.0;
        for(double each:prices){
            if(each>50){
                moreThan50=moreThan50+each;

            }
            System.out.println(moreThan50);

    }

    }

}
