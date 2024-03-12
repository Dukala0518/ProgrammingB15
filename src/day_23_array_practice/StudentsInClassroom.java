package day_23_array_practice;

public class StudentsInClassroom {
    public static void main (String [] args){
        String[] student= {"Selenge","Tulgaa","Duka","Namuun","Kate"};
       int totalStudents=student.length;
        System.out.println("Total Students: "+totalStudents);
        //for(int i=0;i<student.length;i++){
          //  System.out.println(student[i]);
        int counter=0;
         for(  String x : student ){
            counter++;
             System.out.println(counter+":"+x);
         }
         String allFriends="";
         for( String each:student){
             allFriends=allFriends+each+" ,";
             System.out.println(each);

         }  allFriends=allFriends.substring(0,allFriends.length()-1);
         System.out.println(allFriends);

       //Print  2 names at a time
        for(int i=0; i<student.length;i=i+2){
            if(i==student.length-1){
                System.out.println(student[i]);
            }else
               System.out.println(student[i]+" "+student[i+1]);


        }







    }
}
