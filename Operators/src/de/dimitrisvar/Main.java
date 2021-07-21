package de.dimitrisvar;

public class Main {

    public static void main(String[] args) {

        // Operators in Java are special symbols that perform specific operations on one, two,
        // or three operands, and then return a result. An operand is a term used to describe any
        // object that is manipulated by an operator. If we consider this statement
        // int myVar = 15 + 12
        // Then + is the operator, and 15 and 12 are the operands. Variables used instead of
        // literals are also operands.

        // What is an expression?
        // An expression is formed by combining variables, literals, method return values
        // and operators.
        // In the line below, 15 + 12 is the expression which has (or returns) 27 in this case.
        // int myValue = 15 + 12;

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2  = " +result);

        int previousReilt = result;
        System.out.println("previousResult = " +previousReilt);
        result = result -1; // 3 - 1 = 2
        System.out.println("3 - 1 = "+result);
        System.out.println("previousResult = " +previousReilt);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " +result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " +result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " +result);

        // result = result + 1;
        result++; // result 1 + 1 = 2
        System.out.println("1 + 1 = " +result);

        // result = result - 1;
        result--; // result 2 - 1 = 1
        System.out.println("2 - 1 = " +result);

        // result = result +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " +result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " +result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " +result);

        // result = result - 2
        result -=  2; // 10  - 2 = 8
        System.out.println("10 - 2 = " +result);

        // The if-then statement is the most basic of all the control flow statements. It tells
        // your program to execute a certain section of code only if a particular test evaluates
        // to true. Known as conditional logic. Conditional logic uses specific statements in Java
        // to allow us to check a condition and execute certain code based on whatever that condition
        // (the expression) is true or false.

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("He is not an alien!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // Assignment operator (=) equal operator (==)
        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }

        // Ternary Operator ?  The ternary operator is a shortcut to assigning one of two values
        // to a variable depending on a given condition.
        // It's a shortcut of the if-then-else statement
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
