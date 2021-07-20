package de.dimitrisvar;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Valule: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);

        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTets = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Valule: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Valule: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Valule: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("BigLiteralValue: " +bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2); // casting
        System.out.println("MinByteValue: " + myMinByteValue);
        System.out.println("NewByteValue: " + myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2); // casting
        System.out.println("NewShortValue: " +myNewShortValue);
    }
}