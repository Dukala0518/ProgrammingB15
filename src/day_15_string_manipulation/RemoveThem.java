package day_15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence="Java is fun";
        String noSpaces=sentence.replace(" ","");
        System.out.println(noSpaces);
        System.out.println(noSpaces.replace("is",""));
        String etsyResult="iphone case (212,713 Result)";
        etsyResult=etsyResult.replace("iphone case (212,713 Result)","212,713");
        etsyResult=etsyResult.replace(",","");
        System.out.println(etsyResult);

        String mixed="@J#$A^VA*";
        mixed=mixed.replace("@","").replace("#","").replace("$","")
                .replace("^","").replace("*","");
        System.out.println(       );

    }
}
