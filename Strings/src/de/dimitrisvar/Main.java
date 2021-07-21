package de.dimitrisvar;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // The String is a datatype in Java, which is not a primitive type. A String is a
        // sequence of characters. A String can contain a sequence of characters. A large number
        // of characters. Technically it's limited by memory or the MAX_VAUUE of an int
        // which was 2.14 Billion.

        String myString = "This is a string";
        System.out.println("myString is equal to " +myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " +myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " +myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myint = 50;
        lastString = lastString + myint;
        System.out.println("LastString is equal to " +lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " +lastString);

        // Strings in Java are Immutable. That means you can't change a String after it's created.
        // Instead, what happens is a new String is created.

        // In the case of this code, lastString doesn't get appended the value "120.47" instead
        // a new String is created which consists of the previous value of lastString plus a
        // text representation of the double value 120.47

        // The code we used to append Strings was inefficient. As a result of a String being created
        // appending value like this is inefficient and not recommended. A better way of doing it
        // is called StringBuffer

    }
}
