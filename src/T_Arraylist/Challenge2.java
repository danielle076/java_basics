package T_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));
        List<Integer> correctList2 = new ArrayList<>(Arrays.asList(8888, 888, 909909));
        List<Integer> correctList3 = new ArrayList<>(Arrays.asList(909909, 888, 8888));

        System.out.println(sortList(wrongList));
        System.out.println(sortList(correctList));
        System.out.println(sortList(correctList2));
        System.out.println(sortList(correctList3));
    }

    public static String sortList(List<Integer> numbers) {
        if(numbers.size() != 3) {
            return "There are too many or too few numbers in the list.";
        }
        if(numbers.get(0) > numbers.get(1)) {
            Collections.swap(numbers, 0, 1);
        }
        if(numbers.get(1) > numbers.get(2)) {
            Collections.swap(numbers, 1, 2);
            if(numbers.get(0) > numbers.get(1)) {
                Collections.swap(numbers, 0, 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : numbers) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }
}
