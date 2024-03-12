package day_36_wrapper;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        //AUTO-BOXING(PRIMITIVES TO CLASS OBJECT)
        Integer n1=1000;
        int n=345;
        Integer n2=n;
        //UNBOXING;WRAPPER CLASS OBJECT-PRIMITIVE
        Integer n3=Integer.valueOf(1000);
        int num=n3;
        //PRINT VALUES
        System.out.println("n1= "+n1);
        System.out.println("n= "+n);
        System.out.println("n2= "+n2);
        System.out.println("n3= "+n3);
        //BENEFIT:
            //----less memory, we can use with arrays if your array is primitive
        //CONVERTING FROM A STRING TO PRIMITIVES.
        // How can we convert String to primitives>

        //"123"-->int
        //"43.99"-->double
        //see next class CovertStringToPrimitives


    }
}
