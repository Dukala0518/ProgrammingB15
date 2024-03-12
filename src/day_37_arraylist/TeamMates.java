package day_37_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class TeamMates {
    public static void main(String[] args) {
        ArrayList <String>Teammates=new ArrayList<>();
        Teammates.add("Bilguun");
        Teammates.add("Dukala");
        Teammates.add("Erdemt");
        Teammates.add("Enkhrii");
        Teammates.add("Bilguun");
        Teammates.add("Dukala");
        Teammates.add("Erdemt");
        Teammates.add("Enkhrii");
        System.out.println("Team size is: "+Teammates.size());
       Teammates.add("Bilguun");
        System.out.println("Team size is: "+Teammates.size());
        //print first and last person
        System.out.println(Teammates.get(0)+" | "+Teammates.get(Teammates.size()-1));
        //PRINT EACH PERSON USING FOR EACH LOOP
        for(String eachPerson:Teammates){
            System.out.println(eachPerson);
        }
        //PRINT EACH VALUE USING FOR LOOP
        for(int i=0;i<Teammates.size();i++){
            System.out.print(Teammates.get(i)+" ,");
        }
        System.out.println();
        //PRINT EACH VALUE IN REVERSE
        for(int i=Teammates.size()-1;i>=0;i--){
            System.out.print(Teammates.get(i)+" ");
        }
        //PRINT 2 PEOPLE AT A TIME
        System.out.println();
        for(int i=0;i<Teammates.size();i=i+2){
            if(i==Teammates.size()-1){
                System.out.println(Teammates.get(i));
            }else{
            System.out.print(Teammates.get(i)+"|"+Teammates.get(i+1));}
            System.out.println();;

        } //DECLARE STRING ALL TEAM AND ADD EVERYONE INTO THAT STRING.
        String AllTeam="";
        for(int i=0;i<Teammates.size();i++){
            if(i==Teammates.size()-1){
                AllTeam=AllTeam+Teammates.get(i);
            }else{
                AllTeam=AllTeam+Teammates.get(i)+" | ";
            }

        }
        System.out.println(AllTeam);
        }
        //ArrayList methods:
    //add()-->adds a value/item/element into arraylist
    //get()-->read value from index
    //size()-->return the number of values in arrayList
    //toString()-->format all values within [] and separate by comma
    //add(index,value)-->add value to specific position
    //remove(index), remove(object)-->removes element from arrayList
    //set(index,value)-->updates/changes the value in specific index
    }

