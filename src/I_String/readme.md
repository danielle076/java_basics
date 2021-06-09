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


## Parsing Values From String

Parsing values from a String: convert the String into a primitive data type. 

Defining a String, it's interpreted as text and not as a number.

Goal: convert this piece of text into a number.

    String numberAsString = "2018.125";
    System.out.println("numberAsString= " + numberAsString);

With parsing method you convert a String into a number.

You know that you use a class Double because it starts with a capital letter.

This class uses a method .parseDouble that converts the String to a number.

    double number = Double.parseDouble(numberAsString);
    System.out.println("number = " + number);

Calculate with the variables String and double.

    numberAsString += 1; // put a 1 after the number
    number += 1; // adds a 1 to the number
    
    System.out.println("numberAsString = " + numberAsString); // 2018.1251
    System.out.println("number = " + number); // 2019.125

### Full code

    package I_String;
    
    public class ParsingValuesFromString {
    
        public static void main(String[] args) {
            String numberAsString = "2018.125";
            System.out.println("numberAsString= " + numberAsString);
    
            double number = Double.parseDouble(numberAsString);
            System.out.println("number = " + number);
    
            numberAsString += 1; // zet een 1 achter het getal
            number += 1; // telt een 1 op bij het getal
    
            System.out.println("numberAsString = " + numberAsString); // 2018.1251
            System.out.println("number = " + number); // 2019.125
        }
    }