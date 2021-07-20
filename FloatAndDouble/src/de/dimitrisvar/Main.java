package de.dimitrisvar;

public class Main {

    public static void main(String[] args) {

        // In general float and double are great for general floating point operations. But both
        // are not great to use where precise calculations are required - this due to a limitation
        // with how floating point numbers are stored, and not Java problem as such.

        // Java has a class called BigDecial that overcomes this problem.
        // When precise calculations are necessary, such as when performing currency caluclations,
        // floating-point types should not be used.

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " +myMinFloatValue);
        System.out.println("Float Maximum Value: " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " +myMinDoubleValue);
        System.out.println("Double Maximum Value: " +myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5 / 3; // we can specify double with the char "d" on the end of the literal
        System.out.println("MyIntValue: " +myIntValue);
        System.out.println("MyFloatValue: " +myFloatValue);
        System.out.println("MyDoubleValue: " +myDoubleValue);

        double pounds = 200d;
        double convertKilograms = pounds * 0.45359237d;
        System.out.println("Converted kilograms: " +convertKilograms);

        double pi = 3.1315927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
