package day_26_Arrays_more_practices;

public class Tools {
    public static void main(String[] args) {
        String str="java,selenium,git";
        String [] strArr=str.split(",");
        System.out.println(strArr.length);
        for(String toolName:strArr) {
            if (toolName.equals("java")) {
                System.out.println(toolName + "fun programming lamnguage");
            } else if (toolName.equals("selenium")) {
                System.out.println(toolName + "automation");
            } else if (toolName.equals("git")) {
                System.out.println(toolName + "You did it.Congrats!");
            }

        }

            }
        }

