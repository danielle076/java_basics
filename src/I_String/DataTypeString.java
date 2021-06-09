package I_String;

public class DataTypeString {

    public static void main(java.lang.String[] args) {
        java.lang.String myString = "This is a String";
        System.out.println("myString is equal to " + myString); // myString is equal to This is a String
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString); // myString is equal to This is a String, and this is more.
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to " + myString); // myString is equal to This is a String, and this is more. © 2020

        // numbers are not added together but sequenced, String is a text data type and not numerical
        java.lang.String numberString = "250.55 ";
        numberString = numberString + "49.95";
        System.out.println(numberString); // 250.55 49.95

        // int is converted to a String by Java
        java.lang.String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Laststring is equal to " + lastString); // Laststring is equal to 1050
    }
}
