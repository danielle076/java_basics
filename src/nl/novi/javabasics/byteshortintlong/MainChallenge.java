package nl.novi.javabasics.byteshortintlong;

public class MainChallenge {
    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
    }
}


/* Your challenge is to create a byte variable and set it to any valid byte number, it doesn't matter. Create a short
variable and set it to any valid short number.

Create an int variable and set it to any valid int number. Lastly, create a variable of type long and make it equal
to 500000 plus 10 times the sum of the byte plus the short plus the integer values.
 */
