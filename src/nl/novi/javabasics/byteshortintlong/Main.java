package nl.novi.javabasics.byteshortintlong;

public class Main {
    public static void main(String[] args) {
        // int
        int myValue = 10000;
        // waar normaal een punt komt mag je een '_'
        int myValue2 = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue); // -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue); // 2147483647
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // -2147483648
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // 2147483647

        // je kan geen int van 2147483648 intikken: foutmelding
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
        // een long eindigt altijd met een hoofdletter L. Gebruik je de L niet dan ziet Java het nummer als een int
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue); // -9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue); // 9223372036854775807

        int myTotal = (myMaxIntTest / 2);
        // wanneer je (byte) of (short) niet toevoegd zal Java het zien als een default integer
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // gebruik altijd een integer, behalve wanneer je echt een byte, short of long moet gebruiken
    }
}

