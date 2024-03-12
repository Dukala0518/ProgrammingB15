package day00;

public class Practice13 {
    public static void main(String[] args) {
        String [] students=new String[]{"Selenge","Tulgaa","Bilguun","Dukala","Dulguun"};
        for(int i=0;i<students.length;i++){
            if(i== students.length-1){
          System.out.println(students[i]);
        }else{
                System.out.println(students[i]+" "+students[i+1]);
            }

        }
    }

}
/* for(int i=0; i<student.length;i=i+2){
            if(i==student.length-1){
                System.out.println(student[i]);
            }else
               System.out.println(student[i]+" "+student[i+1]);

* */