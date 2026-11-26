public class MethodsAndFunctions {
    // 1. Static method ("function"): belongs to the class, no object needed to call
    // it
    static int add(int a, int b) {
        return a + b;
    }

    // Helper static method that returns the square of a number
    static int square(int n) {
        return n * n;
    }

    // 2. Method calling another method (composition)
    static int sumOfSquares(int a, int b) {
        // Calls square() twice and passes the results into add()
        return add(square(a), square(b));
    }

    // 3. Instance method: belongs to an object created from the class
    void printMessage(String message) {
        System.out.println("Instance method says: " + message);
    }

    // 4. Recursive method: a method that calls itself with a smaller input
    static int factorial(int n) {
        if (n <= 1) {
            return 1; // Base case: stops the recursion
        }
        int previous_value = factorial(n - 1);
        int current_value = n * previous_value;
        return current_value; // Recursive case: n! = n * (n - 1)!
    }

    public static void main(String[] args) {
        // Calling static methods directly
        int sum = add(5, 3);
        System.out.println("add(5, 3) = " + sum);

        // Passing a method call as an argument to another method
        int nestedResult = add(square(2), 10);
        System.out.println("add(square(2), 10) = " + nestedResult);

        // Calling a method that internally calls other methods
        System.out.println("sumOfSquares(3, 4) = " + sumOfSquares(3, 4));

        // Calling an instance method requires creating an object first
        MethodsAndFunctions example = new MethodsAndFunctions();
        example.printMessage("Hello from an object!");

        // Calling a recursive method: 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("factorial(5) = " + factorial(5));
    }
}
