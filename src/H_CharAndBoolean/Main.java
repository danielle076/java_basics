package H_CharAndBoolean;

public class Main {

    public static void main(String[] args) {
        // char
        char myChar = 'D';

        // unicode is always written with first \ and then a code from unicode-table.com.
        char myUnicodeChar = '\u0044';
        System.out.println(myChar); // D
        System.out.println(myUnicodeChar); // D
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar); // ©

        // boolean
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
