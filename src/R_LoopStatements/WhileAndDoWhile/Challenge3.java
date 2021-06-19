package R_LoopStatements.WhileAndDoWhile;

public class Challenge3 {
    public static void main(String[] args) {
        int counter = 0;

        while (counter != 11) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
