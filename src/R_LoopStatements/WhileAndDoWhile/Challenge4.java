package R_LoopStatements.WhileAndDoWhile;

public class Challenge4 {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 11) {
            if (counter % 2 == 1) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}