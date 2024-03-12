package day_19_for_loop_practice;

public class CountHowMany {
    public static void main(String[] args) {
        //loop from first until last letter
        //read each letter and compare if it equals myChar
        //if true increase by 1
        //after loop print "count"
        String str="java loops are fun";
        int count=0;
        char myChar='j';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==myChar){
                count=count+1;                                //ask Bill
                System.out.println(myChar+" found at "+i);

            }

        }
        System.out.println(count);

    }
}
