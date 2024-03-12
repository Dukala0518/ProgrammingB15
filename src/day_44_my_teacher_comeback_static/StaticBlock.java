package day_44_my_teacher_comeback_static;

public class StaticBlock {
    public static class InnerClass{
        public static void innerClassStaticMethod(){
            System.out.println("HELLO FROM INNER CLASS");
        }


    }
    //static block
    static {
        System.out.println("STATIC BLOCK-ONCE BEFORE EVERYTHING ELSE");
    }
    public StaticBlock(){
        System.out.println("CONSTRUCTOR");
    }
    public static void staticMethod(){
        System.out.println("STATIC METHOD");
    }


}
