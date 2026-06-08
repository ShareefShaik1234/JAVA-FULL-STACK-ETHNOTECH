package day10.ExceptiOn;


public class Exp {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = divide(a, b);
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }

    static int divide(int a, int b) {
        return a / b;
    }
}