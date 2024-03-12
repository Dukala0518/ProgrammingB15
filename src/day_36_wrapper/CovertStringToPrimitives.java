package day_36_wrapper;

public class CovertStringToPrimitives {
    public static void main(String[] args) {
        //by converting to primitive numbers, we can use arithmetic/math
        //operation,comparison operators ex...
        boolean booleanValue=Boolean.parseBoolean("True");
        char charValue="a".charAt(0);//Character class does not have parse method. Work on that
        byte byteValue=Byte.parseByte("100");
        short shortValue=Short.parseShort("10000");
        int intValue=Integer.parseInt("8945");
        long longValue=Long.parseLong("56789876543");
        float floatValue=Float.parseFloat("23.45");
        double doubleValue=Double.parseDouble("898696.5");
        String price="99.99";
        double doublePrice=Double.parseDouble(price);
        System.out.println(doublePrice);
        //DIFFERENCE BETWEEN:
          //Integer.valueOf and Integer.parseInt??
        //Integer.valueOf("234')==>convert String to wrapper class object
                      //valueOf----return wrapper class object
        //Integer.parseInt("100")==>convert String to primitive
                      //parseInt-----return a primitive
        //Will this work?
        int i=Integer.valueOf("234");
        //Yes.how?
            //1). converting "234" string to wrapper class
            //2). converting wrapper class to primitive (UNBOXING)



    }

    public static class WrapperObjectsReview {
        public static void main(String[] args) {
            //******Declaring and creating wrapper class object********

            Boolean result=Boolean.valueOf(false);
            Character c2=Character.valueOf('a');
            Byte by1= Byte.valueOf((byte)10);
            Short sh=Short.valueOf((short)10);
            Short sh2=Short.valueOf("300");
            Integer i1=Integer.valueOf(300);
            Long l1= Long.valueOf(59607007);
            Float f1=Float.valueOf(21.2F);

            //Converting from Primitive to Wrapper class object
            //or wrapper class object to primitive.
            //Primitive-->Wrapper class object(its called AUTO-BOXING)
            //Wrapper class object-->Primitive(it is called UN-BOXING)






        }
    }
}
