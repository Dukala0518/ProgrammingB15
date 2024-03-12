package day00;

public class practice11 {
    public static void main(String[] args) {
        System.out.println(commonEnd(new int[]{5, 6, 7, 5, 6, 7}, new int[]{9, 6, 7, 8}));
        String str="Janjan";
        System.out.println(str.length());
        String strArr[]={"Janjan","Janjna"};
        System.out.println(strArr.length);
    }
    public static boolean commonEnd(int[] a, int[] b) {
        if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){
            return true;


        }else{
            return false;
        }
}}
