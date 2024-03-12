package day_35_methods_with_array;

public class ScoreGrade {
    public static void main(String[] args) {
        System.out.println(getGrade(67));
        System.out.println(getGrade(101));
        if(getGrade(70)=='C'){
            System.out.println("Passed=C grade returned correctly");
        }else{
            System.out.println("Failed-Unittest error");
        }
        char gradeTest=getGrade(35);
       if(gradeTest=='F'){
           System.out.println("UNIT TEST PASS");
       }else{
           System.out.println("UNIT TEST FAIL");
       }
    }
    public static char getGrade(int score){
        char grade;
        if(score<=100 && score>=90){
            grade= 'A';
        } else if(score<=89 && score>=80){
            grade= 'B';
        } else if(score<=79 && score>=70){
            grade= 'C';
        } else if(score<=69 && score>=60){
            grade= 'D';
        } else if(score<=59 && score>=0){
            grade= 'F';
        } else{
            System.out.println("Error: "+score);
            return '0';
        }
        return grade;
    }

}
