package H_CharAndBoolean;

public class Main {

    public static void main(String[] args) {
        // char
        char myChar = 'D';
        System.out.println(myChar); // D

        // unicode is always written with first \ and then a code from unicode-table.com.
        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar); // D
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar); // ©

        // ASCII is always written with first \ and then a code from asciitable.com.
        char myAscIIChar = '\106';
        System.out.println(myAscIIChar); // F

        // boolean
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
