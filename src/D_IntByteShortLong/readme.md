## Int, byte, short & long

In Java, there are different `number data types`.

- `int`: Whole numbers. Minimum of -2,147,483,648, maximum of 2,147,483,647.
- `byte`: Integer numbers. Minimum -128, maximum 127.
- `short`: Integer numbers. Minimum -32,768, maximum 32,767.
- `long`: Whole numbers. Minimum -9,223,372,036,854,775,808, maximum 9,223,372,036,854,775,807

Which type to use when? Depends on the size, but the use of int (integer) is recommended, except when you really need to
use a byte, short or long.

### int

    int myValue = 10000;
    
    // where normally a point is reached, you may use a '_'
    int myValue2 = 10_000;
    
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value = " + myMinIntValue); // -2147483648
    System.out.println("Integer Maximum Value = " + myMaxIntValue); // 2147483647
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // -2147483648
    System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // 2147483647
    
    // you cannot enter int of 2147483648: gives error message
    int myMaxIntTest = 2147483647;

### byte

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue); // -128
    System.out.println("Byte Maximum Value = " + myMaxByteValue); // 127

### short

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue); // -32768
    System.out.println("Short Maximum Value = " + myMaxShortValue); // 32767

### long

A `long` always ends with a capital L. If you don't use the L, Java will see the number as an `int`.

    long myLongValue = 100L;
    
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue); // -9223372036854775808
    System.out.println("Long Maximum Value = " + myMaxLongValue); // 9223372036854775807
    
    int myTotal = (myMaxIntTest / 2);
    // when you don't add (byte) or (short) Java will see it as a default integer
    byte myNewByteValue = (byte) (myMinByteValue / 2);
    short myNewShortValue = (short) (myMinShortValue / 2);

## Challenge

Your challenge is to create a `byte` variable and set it to any valid `byte` number, it doesn't matter. Create a `short`
variable and set it to any valid `short` number.

Create an `int` variable and set it to any valid `int` number. Lastly, create a variable of type `long` and make it
equal to 50000 plus 10 times the `sum` of the `byte` plus the `short` plus the `integer` values.
