import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {
        // --- 1. Primitive Integer Types (whole numbers) ---
        byte smallByte = 100;             // 8-bit: -128 to 127
        short smallShort = 30000;         // 16-bit: -32,768 to 32,767
        int regularInt = 100_000;         // 32-bit: most common whole number type
        long bigLong = 9_000_000_000L;    // 64-bit: requires 'L' suffix for large literals

        // --- 2. Primitive Floating-Point Types (decimals) ---
        float smallFloat = 3.14f;         // 32-bit: requires 'f' suffix
        double regularDouble = 3.1415926; // 64-bit: default & more precise decimal type

        // --- 3. Character & Boolean Primitives ---
        char letter = 'J';                // 16-bit single Unicode character (single quotes)
        boolean isJavaFun = true;         // true or false

        // --- 4. Reference Types (Objects) ---
        String greeting = "Hello, Java!"; // Sequence of characters (double quotes)
        int[] numbers = {1, 2, 3, 4};     // Fixed-size array of ints

        // --- 5. Type Casting (converting between types) ---
        int widened = smallByte;          // Implicit widening (byte -> int)
        int narrowed = (int) 9.78;        // Explicit narrowing (double -> int, truncates to 9)

        // Print all values
        System.out.println("byte: " + smallByte);
        System.out.println("short: " + smallShort);
        System.out.println("int: " + regularInt);
        System.out.println("long: " + bigLong);
        System.out.println("float: " + smallFloat);
        System.out.println("double: " + regularDouble);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + greeting);
        System.out.println("int[]: " + Arrays.toString(numbers));
        System.out.println("widened byte->int: " + widened);
        System.out.println("narrowed double->int: " + narrowed);
    }
}
