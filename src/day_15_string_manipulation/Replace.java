package day_15_string_manipulation;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Objects;

public class Replace {
    public static void main(String[] args) {
       /*  String word="java";
        System.out.println(word.replace("j", "k"));
        System.out.println(word.replace("ja", "ka"));
        System.out.println(word.replace("a", "j"));
        System.out.println(word.replace("ja","k"));
        System.out.println(word.replace("old", "new"));
        System.out.println(word.replace("a","dog"));*/

        String words="sad,cry,python";
        System.out.println(words.replace("sad", "happy"));
        System.out.println(words.replace("cry", "smile"));
        System.out.println(words.replace("python", "java"));
        words=words.replace("sad","happy");
        System.out.println(words);
        words=words.replace(","," | ");
        System.out.println(words);
        String capital="London is capital of UK";
        capital=capital.replace("London", "Ankara");
        capital=capital.replace("UK","TURK");
        System.out.println(capital);
        capital= Objects.requireNonNull(capital.replace("Ankara", "Washington DC")
                .replace("TURK","USA"));
        System.out.println(capital);


    }
}
