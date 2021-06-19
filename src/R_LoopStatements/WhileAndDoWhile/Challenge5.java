package R_LoopStatements.WhileAndDoWhile;

public class Challenge5 {
    public static void main(String[] args) {
        int counter = 1;

        while (counter < 100) {
            System.out.println("Number: " + counter);
            if (counter == 22) {
                break;
            }
            counter = counter + 1;
        }
    }
}
