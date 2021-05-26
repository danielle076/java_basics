package E_Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This will let an user type in a number and give the number back
        int number = 0;
        System.out.println("Geef een nummer invoer op");
        Scanner userInteraction = new Scanner(System.in);
        number = userInteraction.nextInt();
        System.out.println("Uw invoer was: " + number);

        // This will let an user type in text and give the text back
        System.out.print("Wat is uw naam: ");
        String userName = userInteraction.next();
        System.out.println("Uw naam is: " + userName);
    }
}