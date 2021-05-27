## Variables

Variables are containers in which you can store data in Java. These variables have a data type, a name and a value.

- <i>type</i> indicates what kind of information is stored in that variable
- <i>name</i> describes the information stored
- <i>value</i> is the stored information itself

In Java, there are different data types of variables, for example:

- `String` - stores text, such as "Hello". String values are surrounded by double quotes
- `int` - stores integers (whole numbers), without decimals, such as 123 or -123
- `float` - stores floating point numbers, with decimals, such as 19.99 or -19.99
- `char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- `boolean` - stores values with two states: true or false

### Declaring (creating) Variables
To create a variable, you must specify the type and assign it a value.

    type variable = value;

Where type is one of Java's data types, and variable is the name of the variable (such as x or name). The equal sign is used to assign values to the variable.

### Example

    String name = "Danielle";
    System.out.println(name);

You can also declare a variable without assigning the value, and assign the value later.

    int num;
    num = 15;
    System.out.println(num);

Note that if you assign a new value to an existing variable, it will overwrite the previous value.

    int anotherNum = 15;
    anotherNum = 27;  // anotherNum is now 27
    System.out.println(anotherNum);

A demonstration of how to declare variables of other data types.

    int myNum = 15;
    float myFloatNum = 8.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";