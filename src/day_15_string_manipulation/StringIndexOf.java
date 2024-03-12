package day_15_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies="java,c++,tomcat,aws";
        int java,c,python,tomcat,aws;
        java= technologies.indexOf("java");
        c=technologies.indexOf("c++");
        python=technologies.indexOf("python");
        tomcat=technologies.indexOf("tomcat");
        aws=technologies.indexOf("aws");
        int html=technologies.indexOf("html");
        System.out.println(java);
        System.out.println(tomcat);
        System.out.println(html);
        System.out.println(technologies.indexOf("c++"));
        if (technologies.contains("c++")) {
            System.out.println("C++ IS IN THERE");
            int firstComa=technologies.indexOf(",");
            int lastComa=technologies.lastIndexOf(",");
            System.out.println(firstComa);
            System.out.println(lastComa);
            System.out.println(technologies.indexOf(",", 5));
            int secondComa=technologies.indexOf(",",5);
            System.out.println(secondComa);
            System.out.println(technologies.indexOf(",",secondComa+1));
            String url="www.cybertekschool.okta.com";
            int firstDot= url.indexOf(".");
            System.out.println(firstDot);
            int secondDot=url.indexOf(".",firstDot+1);
            System.out.println("secondDot = " + secondDot);
            int thirdDot=url.indexOf(".",secondDot+1);
            System.out.println("thirdDot = " + thirdDot);

            String letter="abcabcabc";
            System.out.println("letter.indexOf(\"a\") = " + letter.indexOf("a"));
            System.out.println(letter.indexOf("a",2));

            System.out.println(letter.lastIndexOf("a"));



        }


        }

    }

