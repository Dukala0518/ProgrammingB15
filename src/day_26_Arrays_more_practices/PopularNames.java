package day_26_Arrays_more_practices;

import java.util.Arrays;

public class PopularNames {
    public static void main(String[] args) {
        String []names={"Selenge","Tulgaa","Dukala","Bilguun","Dulguun","Aagii","Oojii","Enkhee"};
        System.out.println(Arrays.stream(names).count());
        int BilguunIndex=-1;      //Assuming Bilguunii index is -1
        for (int i=0; i<names.length;i++){
            if(names[i].equals("Bilguun")){
                BilguunIndex=i;
                System.out.println(BilguunIndex);
                 break;
            }

        }System.out.print("Females names:");
        for(int i=0;i< names.length;i=i+2){
            System.out.print( " "+names[i]+", ");
        }
        System.out.println();
        System.out.print("Males names:");
        for(int i=1;i< names.length;i+=2){
            System.out.print(" "+names[i]+", ");
        }System.out.println();
     String maleName="";
     String femaleName="";
        for(int i=0;i< names.length;i++){
            if(i%2==0){
                femaleName=femaleName+names[i]+" ,";
            } else{
                maleName+=names[i]+", ";


        }


    }   System.out.println("Female:"+ femaleName);
        System.out.println("Male:"+maleName);
        if(femaleName.contains("Selenge")){
            System.out.println("Selenge is there");
        } if(maleName.contains("Aagii")){
            System.out.println("Aagii is there");
        } //**********     find the longest/shortest name    ************************
        String longestName=names[0];
        String shortestName=names[0];
        for(int i=0;i< names.length;i++){
        if(names[i].length()>longestName.length()){
            longestName=names[i];
        }
        if(names[i].length()<shortestName.length()){
           shortestName=names[i];
}
        }
        System.out.println("Longest name is: "+longestName);
        System.out.println("Shortes name is: "+shortestName);

        }
}

