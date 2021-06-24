package T_Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge3 {

    public static void main(String[] uitlegList) {
        // We have a list that includes the names of soccer clubs
        List<String> clubNames = new ArrayList<>();

        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Question 1: Create a method whose task is to print out the list by line
        printList(clubNames);

        // Question 2: Create a method whose task is to print the list: position + content
        // The above list would then be this:
        // 0 - Ajax
        // 1 - PSV
        // etc...
        printListWithIndex(clubNames);

        // Question 3: Create a method that checks if a club is already in the list and add it otherwise
        addClub(clubNames, "DOSC");

        // Question 4: Create a method that returns the position of the club in the list
        int position = positionInList(clubNames, "DOSC");

        // Question 5: Create a method that sorts the list alphabetically. If Ajax is not in position 1, the
        // clubs that are in front of Ajax should be removed
        // We add some more clubs to test the code
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        sortListAndAjaxFirst(clubNames);
        System.out.println("List after sorting and Ajax first:");
        printListWithIndex(clubNames);

        // Question 6: Can you do the same as above, but PSV should be last in that case
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");

        System.out.println("PSV last: ");
        clubNames = sortListAndPsvLast(clubNames);
        System.out.println("List after sorting and PSV Last:");
        printListWithIndex(clubNames);
    }

    public static void printList(List<String> clubs) {
        System.out.println("The clubs in the list: ");
        for (String club : clubs) {
            System.out.println(club);
        }
    }

    public static void printListWithIndex(List<String> clubs) {
        System.out.println("Clubs in list with position: ");
        for (int i = 0; i < clubs.size(); i++) {
            System.out.println(i + " : " + clubs.get(i));
        }
    }

    public static void addClub(List<String> clubs, String name) {
        if (isUnique(clubs, name)) {
            clubs.add(name);
        }
    }

    public static boolean isUnique(List<String> clubs, String name) {
        for (String club : clubs) {
            if (club.equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    public static int positionInList(List<String> clubs, String name) {
        if (!isUnique(clubs, name)) {
            for (int i = 0; i < clubs.size(); i++) {
                if (name.equalsIgnoreCase(clubs.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void sortListAndAjaxFirst(List<String> clubs) {
        Collections.sort(clubs);

        while (positionInList(clubs, "Ajax") != 0) {
            clubs.remove(0);
        }
    }

    public static List<String> sortListAndPsvLast(List<String> clubs) {
        Collections.sort(clubs);

        //System.out.println("Pos psv: " + positionInList(clubs, "psv"));

        int indexPsv = positionInList(clubs, "psv");
        System.out.println("index PSV: " + indexPsv);

        List<String> tempList = new ArrayList<>();

        for (int i = 0; i < clubs.size(); i++) {
            if (i <= indexPsv) {
                tempList.add(clubs.get(i));
            }
        }
        return tempList;
    }
}
