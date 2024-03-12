package day11_string_comparison_logical;

public class CreditChecker {
    public static void main(String[] args) {
        int score = 777;
        if (score >= 750) {
            System.out.println("Excellent");
        } else if (score > 700 && score < 749) {
            System.out.println("Good");
        } else if (score > 650 && score < 699) {
            System.out.println("Fair");

        } else if (score > 550 && score < 649) {
            System.out.println("Poor");

        } else if (score < 549) {
            System.out.println(" Bad");
        }
    }
}

