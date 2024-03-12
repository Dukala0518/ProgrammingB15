package day00;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println(repeat("Bilguun", 1));
        String Duka="Dukala";
        int Bill=3;
        System.out.println(Duka.substring(Duka.length() - 3, Duka.length()));
boolean check=longerThan3((new double[]{3.3,6,9}));

    }
    public static String repeat(String a, int n){
       String f="";
        for (int i = 0; i <n ; i++) {
            f=f+a.substring(a.length()-n,a.length());
        }

        return f;
    }
    public static boolean longerThan3(double[] nums){
        //boolean found=false;
        if(nums.length>3){
            return true;
        }else{
            return false;
        }

    }
}
