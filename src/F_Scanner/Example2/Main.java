package F_Scanner.Example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Wat is uw naam: ");

        Scanner userInteraction = new Scanner(System.in);
        String userName = userInteraction.next();

        System.out.println("Uw naam is: " + userName);
    }
}