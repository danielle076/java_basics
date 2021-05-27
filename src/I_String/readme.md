## String

Text is stored in a variable of type String. Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable (cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created.

A String is a data type, such as an int and float, but is used to represent text rather than numbers. For example, the word "hamburger" and the phrase "I ate 3 hamburgers" are both Strings. Even "12345" could be considered a String, if specified correctly.

    String myString = "This is a String";
    System.out.println("myString is equal to " + myString); // myString is equal to This is a String
    myString = myString + ", and this is more.";
    System.out.println("myString is equal to " + myString); // myString is equal to This is a String, and this is more.
    myString = myString + " \u00A9 2020";
    System.out.println("myString is equal to " + myString); // myString is equal to This is a String, and this is more. © 2020
    
Numbers are not added together but sequenced, String is a text data type and not numerical.

    String numberString = "250.55 ";
    numberString = numberString + "49.95";
    System.out.println(numberString); // 250.55 49.95
    
int is converted to a String by Java.

    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println("Laststring is equal to " + lastString); // Laststring is equal to 1050
