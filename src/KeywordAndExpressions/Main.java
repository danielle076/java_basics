package KeywordAndExpressions;

public class Main {

    public static void main(String[] args) {
        // you must never use a reserved keyword as a variable
        // words you also should not use are: false, true and null
        // keywords are shown in blue in IntelliJ
        // https://en.wikipedia.org/wiki/List_of_Java_keywords
        int int2 = 5;

        // expressions are essentially building blocks of all Java programs
        // expressions are built with values, variables, operators and method calls
        double kilometres = 100 * 1.609344;
        // 'kilometres = 100 * 1.609344);' is the expression. A data type double does not belong here

        int highScore = 50;
        if (highScore == 50) {
        }
        // 'highScore == 50' is the expression. If, () and {} do not participate in the expression

        int highScore2 = 50;
        if (highScore2 == 50) {
            System.out.println("This is an expression");
        }
        // '"This is an expression"' is the expression. System.out.println, () and ; do not participate
        // System.out.println is een method
    }
}