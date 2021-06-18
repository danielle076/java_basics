package K_DecisionMakingStatements.IfThenElse;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("What is your gender?");
        String gender = userInputScanner.nextLine();

        if (gender.equalsIgnoreCase("woman")) {
            System.out.println("Hello madam.");
        } else if (gender.equalsIgnoreCase("man")) {
            System.out.println("Hello sir.");
        } else {
            System.out.println("Hello person.");
        }
    }
}
