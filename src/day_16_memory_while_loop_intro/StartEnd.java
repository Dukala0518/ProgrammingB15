package day_16_memory_while_loop_intro;

public class StartEnd {
    public static void main(String[] args) {
        String sentence="I am a [Java] programmer";
        int start=sentence.indexOf("[");
        int end=sentence.indexOf("]");
        System.out.println(sentence.substring(start+1,end));


    }
}
