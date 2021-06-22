package S_Array;

import java.util.Arrays;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        highestNumber(Arrays.asList(1, 2, 3, 4, 5, 6, 22, 333, 555, 7777));
    }

    public static String highestNumber(List<Integer> numbers) {
        int highestNumber = 0;

        for (int number : numbers) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        return "The highest number of the given numbers is: " + highestNumber;
    }
}
