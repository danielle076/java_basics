package byteshortintlong;

public class Main {
    public static void main(String[] args) {
        // int
        int myValue = 10000;

        // where normally a point is reached, you may use a '_'
        int myValue2 = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue); // -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue); // 2147483647
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // -2147483648
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // 2147483647

        // you cannot enter int of 2147483648 gives error message
        int myMaxIntTest = 2147483647;

        // byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue); // -128
        System.out.println("Byte Maximum Value = " + myMaxByteValue); // 127

        // short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue); // -32768
        System.out.println("Short Maximum Value = " + myMaxShortValue); // 32767

        // long
        // a long always ends with a capital L. If you don't use the L, Java will see the number as an int
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue); // -9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue); // 9223372036854775807

        int myTotal = (myMaxIntTest / 2);
        // when you don't add (byte) or (short) Java will see it as a default integer
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // always use an integer, except when you really need to use a byte, short or long
    }
}

