package day_26_Arrays_more_practices;

import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class CanvasURL {
    public static void main(String[] args) {
        String url="www.learn.cybertelschool.com/courses/288/modules";
        String[] urlArr=new String[4];
        urlArr[0]="www.learn.cybertelschool";
        urlArr[1]="courses";
        urlArr[2]="288";
        urlArr[3]="modules";

        //----------------------------------------------------------------------

       String [] newurlArr=url.split("/");
        System.out.println(Arrays.toString(newurlArr));
       // System.out.println(Arrays.toString(url.split("/")));

        //------------------------------------------------------------------------
       //for loop
        for(int i=0;i<newurlArr.length;i++){
       System.out.print(newurlArr[i]+" ");
}
        System.out.println();
        //for each loop
        for (String j:newurlArr){
            System.out.print(j+" ");
        }
        String baseUl=newurlArr[0];
        String resources= newurlArr[1];
        String id=newurlArr[2];
        String target=newurlArr[3];
        System.out.println();
        System.out.println("target = " + target);
        System.out.println("id = " + id);
        System.out.println("baseUl = " + baseUl);
        System.out.println("resources = " + resources);

        switch (id){
            case "288":
                System.out.println("Java Programming");
                break;
            case"287":
                System.out.println("Interview preparation");
                break;
            case "286":
                System.out.println("API Testing");
                break;
            case "289":
                System.out.println("Review Session");
                break;
            default:



        }


    }
}
