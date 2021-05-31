package F_Scanner;

import java.util.Scanner;

public class MainChallenge {

    public static void main(String[] args) {
        // userinput code
        System.out.println("Voer achter elkaar drie getallen in");
        Scanner userInteraction = new Scanner(System.in);

        int userInput1 = userInteraction.nextInt();
        int userInput2 = userInteraction.nextInt();
        int userInput3 = userInteraction.nextInt();

        // average calculation code
        int sum = userInput1 + userInput2 + userInput3;
        System.out.println("Gemiddelde van je invoer is: " + sum / 3);
    }
}
