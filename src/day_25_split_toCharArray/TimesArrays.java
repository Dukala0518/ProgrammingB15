package day_25_split_toCharArray;

public class TimesArrays {
    public static void main(String[] args) {
        int[] time1={18,45};
        int[] time2={18,55};
        //check if time1 and time have valid values
        //hour 0-23  minute 0-59
        if(time1[0]>time2[0]){
            System.out.println("time1 is earlier"+time1[0]+":"+time1[1]);
        } else if (time1[0]<time2[0]) {
            System.out.println("time2 is earlier" + time2[0] + ":" + time2[1]);

        } else if (time1[0]==time2[0]) {
            if(time1[1]>time2[1]){
                System.out.println("time1 is earlier"+time1[0]+":"+time1[1]);
            } else{
                System.out.println("time2 is earlier" + time2[0] + ":" + time2[1]);
            }

        }


    }
    }

