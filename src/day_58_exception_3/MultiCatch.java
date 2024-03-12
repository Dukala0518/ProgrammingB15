package day_58_exception_3;
import java.util.Scanner;
public class MultiCatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value");
        String str=scan.next();
        try{
            System.out.println("in try block...");
            int num=Integer.parseInt(str.substring(0,3));
            System.out.println("num "+num);

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
            System.out.println("message "+e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException ");
            System.out.println("message "+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
            System.out.println("message "+e.getMessage());

        }catch (Throwable t){
            System.out.println("Throwable is caught");
        }
        finally {
            System.out.println("finally block- "+str);
            scan.close();
        }
        System.out.println("After multi catch");
    }
}
