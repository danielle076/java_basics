package K_DecisionMakingStatements.IfThenElse;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your age?");
        int userAge = userInput.nextInt();

        if(userAge > 17) {
            System.out.println("You may buy a state lottery ticket.");
        } else {
            System.out.println("You may not buy a state lottery ticket.");
        }
    }
}
