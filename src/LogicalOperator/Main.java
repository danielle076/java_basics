package LogicalOperator;

public class Main {

    public static void main(String[] args) {
        // && = logical AND
        // both tests need to be true to print the message
        int topScore = 100;
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 110) {
            System.out.println("Greater than second top score and less than 110");
        }

        // the () makes it easier to read the code and you understand more quickly what it means
        int thirdTopScore = 60;
        if ((topScore > thirdTopScore) && (topScore < 110)) {
            System.out.println("Greater than third top score and less than 110");
        }

        // || = logical OR
        // one of the conditions must be true, not both need to be true to print a message
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // ! = logical NOT
        // if a condition is true then logical NOT operator will make false
        int x = 5;
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
    }
}

