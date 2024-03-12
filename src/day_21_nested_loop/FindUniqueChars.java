package day_21_nested_loop;

public class FindUniqueChars {
    public static void main(String[] args) {

                                 // 1.jv are unique since they appear only once
                                 // 2. jav are unique since we removed all duplicates
                                 //how to approach it for #2

        String str="Dulamsuren";
        String unique=""; //  ------->put jav into unique
        for(int n=0; n<str.length();n++){
            String temp=str.charAt(n)+"";
            if(!unique.contains(temp)){
                unique=unique+temp;
            }

        }
        System.out.println(unique);


         }
    }



