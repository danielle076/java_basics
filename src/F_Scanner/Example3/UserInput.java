package F_Scanner.Example3;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // scanning: the variable we are going to use
        // new keyword: we are creating a new object of type scanner
        // System.in: allows you to put info into the console, which then gets returned back to the program
        Scanner scanning = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        // what is put in scanning.nextInt() by the user is stored in yearOfBirth
        int yearOfBirth = scanning.nextInt();
        // when we relate a number from the scanner, we press the Enter key on the keyboard. Doing that ends the line
        // and you can not add your name. Recommended after a next enter, to call .nextLine again without assigning
        // it to a variable (applies only to numbers that ends the program)
        scanning.nextLine();

        System.out.println("Enter your name: ");
        String name = scanning.nextLine();
        int age = 2021 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        // close the scanner after your are done with it
        scanning.close();
    }
}