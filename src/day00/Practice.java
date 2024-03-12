package day00;

public class Practice {
    public static void main(String[] args) {
        String catDog="I like cat and dog,but I like dog more than cat";
       // String newCatDog=catDog.replace(" ","");
        //String newCatDog="";
        int catCount=0;
        int dogCount=0;
        for(int i=0;i<catDog.length()-2;i++){
            if(catDog.substring(i,i+3).equals("cat")){
                catCount++;
            }
            if(catDog.substring(i,i+3).equals("dog")){
                dogCount++;
            }

        }
        System.out.println("Cat:"+catCount);
        System.out.println("Dog:"+dogCount);

    }


    }







