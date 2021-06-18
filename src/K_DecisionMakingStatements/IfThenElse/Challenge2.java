package K_DecisionMakingStatements.IfThenElse;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int givenAge = userInputScanner.nextInt();

        if (givenAge > 25) {
            System.out.println("You may buy alcohol without restrictions.");
        } else if (givenAge > 18) {
            System.out.println("You can buy alcohol, but you have to show your ID.");
        } else {
            System.out.println("You are not allowed to buy alcohol.");
        }
    }
}
