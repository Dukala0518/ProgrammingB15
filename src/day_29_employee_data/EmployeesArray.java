package day_29_employee_data;

import java.util.Arrays;

public class EmployeesArray {
    public static void main(String[] args) {
        String [] employees={"Dulamsuren Begzsuren [SDET] dukala0518@google.com",
                "Amarsaikhan Sambuu [SDET] dukala0518@google.com",
                "Dulamsuren Begzsuren [SBHJB] dukala0518@google.com",
                "Bilguun Amarsaikhan [SCSDJHBC] dukala0518@google.com",
                "Yanjmaa Begzsuren [BHDBVS] dukala0518@google.com",
                "Tungalag Galbaa[SDET] dukala0518@google.com",
                "Begzsuren Ulzii [SDET] dukala0518@google.com"};
       //TASK: Print FirstName-lastName jobTitle
        for (int i=0;i< employees.length;i++){
            String[] empArr=employees[i].split(" ");
            String firts=empArr[0];
            String last=empArr[1];
            String job=empArr[2];
            System.out.println(firts+"|"+last+"|"+job);
            //Bilguun Amarsaikhan [SCSDJHBC]
            //Dulamsuren Begzsuren [SBHJB]
        } for(String emp:employees){
            String []empArr=emp.split(" ");
            String f=empArr[0];
            String l=empArr[1];
            String j=empArr[2];
            if(f.equals("Bilguun")&& l.equals("Amarsaikhan")){
                 if(j.equals("[SCSDJHBC]")){
                    //System.out.println("Pass");
                }

                }
            }

            }

            }





















