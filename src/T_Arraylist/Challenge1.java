package T_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        for (int i = 0; i < customerNames.size(); i++) {
            String tempName = customerNames.get(i);

            String[] splitNames = tempName.split(" ");
            for (int j = 0; j < splitNames.length; j++) {
                if (!isTussenVoegsel(splitNames[j])) {
                    String newName = splitNames[j].substring(0, 1).toUpperCase() + splitNames[j].substring(1);
                    splitNames[j] = newName;
                }
            }

            tempName = String.join(" ", splitNames);
            customerNames.set(i, tempName);
        }

        for (String s : customerNames) {
            System.out.println(s);
        }
    }

    public static boolean isTussenVoegsel(String word) {
        List<String> tussenvoegels = Arrays.asList("van", "de", "den");
        for (String tussenvoegsel : tussenvoegels) {
            if (word.equalsIgnoreCase(tussenvoegsel)) {
                return true;
            }
        }
        return false;
    }
}