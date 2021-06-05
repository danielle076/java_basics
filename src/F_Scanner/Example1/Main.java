package F_Scanner.Example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;

        System.out.println("Geef een nummer invoer op");

        Scanner userInteraction = new Scanner(System.in);
        number = userInteraction.nextInt();

        System.out.println("Uw invoer was: " + number);
    }
}