## String

Text is stored in a variable of type `String`. 

A String is a data type, such as an int and float, but is used to represent text rather than numbers. For example, the word "hamburger" and the phrase "I ate 3 hamburgers" are both Strings. Even "12345" could be considered a String, if specified correctly.

A String variable contains a set of characters enclosed in double quotes. A String in Java is actually an object that contains methods that can perform certain operations on strings. For example, the length of a string can be found using the method `length()`: `System.out.println("The length of the name is: " + name.length());`

Many more methods possible, for example: `toUpperCase()`, `toLowerCase()`, `indexOf()`, `substring()`, see for more methods https://www.w3schools.com/java/java_ref_string.asp. 

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
