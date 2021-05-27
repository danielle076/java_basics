package L_RelationalOperators;

public class Main {

    public static void main(String[] args) {
        // operator == equal to
        // if topScore (100) is equal to 100
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        // operator != not equal to
        // if topScore2 (100) is not equal to 99
        int topScore2 = 100;
        if (topScore2 != 99) {
            System.out.println("You got it!");
        }

        // operator > greater than
        // if topScore3 (100) is greater than 99
        int topScore3 = 100;
        if (topScore3 > 99) {
            System.out.println("Yes!");
        }

        // operator >= greater than or equal to
        // if topScore4 (100) is greater than or equal to 100
        int topScore4 = 100;
        if (topScore4 >= 100) {
            System.out.println("Yes it is!");
        }

        // operator < less than
        // if topScore5 (100) is less than 101
        int topScore5 = 100;
        if (topScore5 < 101) {
            System.out.println("Hell yeah!");
        }

        // operator <= less than equal to
        // if topScore6 (100) is less than or equal to 100
        int topScore6 = 100;
        if (topScore6 <= 100) {
            System.out.println("Oh yes it is!");
        }

        // && stands for AND
        // this performs two tests. They both need to be true to print the message
        // if topScore (100) is greater than 60 AND topScore (100) less than 110
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 110) {
            System.out.println("Greater than second top score and less than 110");
        }
    }
}
