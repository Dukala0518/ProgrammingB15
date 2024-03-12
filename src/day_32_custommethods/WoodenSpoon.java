package day_32_custommethods;

public class WoodenSpoon {
    public static void main(String args [] ){
        openBrowser();
        navigateToEtsy();
        searchForWoodenSpoon();
        printResult();
    }
    public static void openBrowser(){
        System.out.println("----------------------");
        System.out.println("Click on Chrome icon");
        System.out.println("Wait for browser to load");
    }
    public static void navigateToEtsy(){
        System.out.println("----------------------");
        System.out.println("Type Etsy.com to address bar");
        System.out.println("Click on Enter");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("----------------------");
        System.out.println("Type wooden spoon into search field");
        System.out.println("Click on search icon");
    }
    public static void printResult(){
        System.out.println("----------------------");
        System.out.println("Total result is 6587654969");
        System.out.println("----------------------");
    }
}
