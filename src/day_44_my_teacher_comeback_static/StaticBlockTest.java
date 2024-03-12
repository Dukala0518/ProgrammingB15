package day_44_my_teacher_comeback_static;

public class StaticBlockTest {

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        //when you create new object constructor runs once
        //if you create 3 objects 3 constructors run
        StaticBlock obj2=new StaticBlock();
        StaticBlock.staticMethod();
        StaticBlock.InnerClass.innerClassStaticMethod();





    }


}
