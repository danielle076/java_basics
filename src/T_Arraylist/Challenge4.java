package T_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Challenge4 {
    public static void main(String[] secret) {
        List<String> laResistanceMembers = new ArrayList<>();

        // Opdracht 1
        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");
        laResistanceMembers = addMembers(laResistanceMembers, "Freckle");
        laResistanceMembers = addMembers(laResistanceMembers, "Frummel");

        // Opdracht 2
        System.out.println("Encrytped list:");
        for (String s : encryptList(laResistanceMembers)) {
            System.out.println(s);
        }
    }

    // Opdracht 3
    private static List<String> addMembers(List<String> members, String name) {
        boolean isUnique = true;
        for (String member : members) {
            if (name.equalsIgnoreCase(member)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            members.add(name);
        }
        return members;
    }

    private static List<String> encryptList(List<String> members) {
        List<String> encryptedList = new ArrayList<>();

        for (String member : members) {
            encryptedList.add(encryptName(member));
        }

        for (int i = 0; i < encryptedList.size(); i++) {
            if (i % 2 == 0) {
                encryptedList.set(i, reverseEncryptedName(encryptedList.get(i)));
            }
        }
        return encryptedList;
    }

    private static String encryptName(String name) {
        StringBuilder encryptedNameBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            String number = charToNumber(name.charAt(i));
            encryptedNameBuilder.append(number);
            if (i < name.length() - 1) {
                encryptedNameBuilder.append("-");
            }
        }
        return encryptedNameBuilder.toString();
    }

    private static String reverseEncryptedName(String encryptedName) {
        String[] splitString = encryptedName.split("-");

        String[] splitStringReversed = new String[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            splitStringReversed[splitString.length - 1 - i] = splitString[i];
        }

        return String.join("-", splitStringReversed);
    }

    private static String charToNumber(char ch) {
        char tempchar = Character.toLowerCase(ch);
        int number = tempchar - 'a' + 1;

        if (Character.isUpperCase(ch)) {
            number = number + 100;
        }
        return Integer.toString(number);
    }
}
