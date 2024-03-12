package day_57_exception_handling_2;

import java.nio.file.Files;
import java.nio.file.Path;
/*
throws
    -benefit-->helps out code to compile
    -disadvantage--> if exceptions happen during runtime, code will stop amd will
    not continue.
try catch block--is used to handle en exception.
     try block-->we put code that we want to protect from exceptions
     catch block-->is used to catch an exception if it happens
     due to line in try block. if exception happens and gets caught, code in
     catch block will run.

     benefit-->Code will continue running until end without
     stopping due to exception.



*/

public class FileNotFoundDemo {
    public static void main(String[] args) throws Exception {
       System.out.println("before try catch");
        Files.readAllLines(Path.of("file.txt"));
//        try{
//        Files.readAllLines(Path.of("file.txt"));}
//        catch (Exception e){
//            System.out.println("Exception happened and was caught");
//
//        }
        System.out.println("after try catch");

    }

}
