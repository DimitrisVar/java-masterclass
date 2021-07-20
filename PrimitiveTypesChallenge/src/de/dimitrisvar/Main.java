package de.dimitrisvar;

public class Main {

    public static void main(String[] args) {

        // Your challenge is to create a byte variable and set it to any valid byte number, it
        // doesn't matter. Create a short variable and set it to any valid short number.

        // Create an int variable and set it to any valid int number. Lastly, create a variable of type
        // long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus
        // the integer values.

        byte byteVariable = 12;
        short shortVariable = 40;
        int intVariable = 100;
        long longVariable = (50000L + 10L * (byteVariable + shortVariable + intVariable));

        System.out.println(longVariable);

    }
}
