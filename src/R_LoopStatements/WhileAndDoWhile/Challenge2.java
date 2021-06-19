package R_LoopStatements.WhileAndDoWhile;

public class Challenge2 {
    public static void main(String[] args) {
        int numberOfCandies = 22;

        while (numberOfCandies > 0) {
            System.out.println("There are still " + numberOfCandies + " candies left over. Time to eat one more.");

            numberOfCandies--;
        }
        System.out.println("The candies are gone.");
    }
}
