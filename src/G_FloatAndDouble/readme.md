## Float and double 

In Java, there are two `fractional number data types`.

- `float`: Sufficient for storing 6 to 7 decimal digits
- `double`: Sufficient for storing 15 decimal digits

Double is accepted as the default and is most commonly used. 

### Float

    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Float minimum value = " + myMinFloatValue); // 1.4E-45
    System.out.println("Float maximum value = " + myMaxFloatValue); // 3.4028235E38

Using float, you must set an f or (float).

    float myFloatValue = 5.25f;
    float myFloatValue2 = (float) 5.25;

### Double

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("Double minimum value = " + myMinDoubleValue); // 4.9E-324
    System.out.println("Double maximum value = " + myMaxDoubleValue); // 1.7976931348623157E308

Using double you may set a d.

    double myDoubleValue = 5.25d;

### Int vs float vs double

Double is more precise than float.

    int myInt = 5 / 3;
    float myFloat = 5f / 3f;
    double myDouble = 5d / 3d;
    System.out.println("myInt = " + myInt); // 1
    System.out.println("myFloat = " + myFloat); // 1.6666666
    System.out.println("myDouble = " + myDouble); // 1.6666666666666667

## Challenge

Convert a given number of pounds to kilograms.

1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms
2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable
3. Print out the result

Hint: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.
