package day_22_arrays_introduction;

public class ForEachLoop2 {
    public static void main(String[] args) {
        int[] num = {5, 6, 7, 89, 0, 62};
        double[] prices = {99.99, 12.99, 79.44, 102.05};
        for (int x : num) {
            System.out.print(x + " ");
        }
        System.out.println();
        for(double x: prices){
            System.out.println(x+" ");
        }
    }
}

