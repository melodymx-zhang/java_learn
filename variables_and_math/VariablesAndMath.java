public class VariablesAndMath {
    public static void main(String[] args) {
        // Declare integer variables (whole numbers)
        int a = 10;
        int b = 3;

        // Basic integer arithmetic
        int sum = a + b; // Addition: 13
        int difference = a - b; // Subtraction: 7
        int product = a * b; // Multiplication: 30
        int quotient = a / b; // Integer division (drops remainder): 3
        int remainder = a % b; // Modulo (remainder after division): 1

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b (int) = " + quotient);
        System.out.println("a % b = " + remainder);

        // Declare floating-point variables (decimal numbers)
        double x = 10.0;
        double y = 3.0;
        double exactQuotient = x / y; // Decimal division: 3.3333...

        System.out.println("x / y (double) = " + exactQuotient);

        // Using Java's built-in Math class
        double squared = Math.pow(a, 2); // 10^2 = 100.0
        double root = Math.sqrt(16); // Square root of 16 = 4.0

        System.out.println("10 squared = " + squared);
        System.out.println("Square root of 16 = " + root);
    }
}
