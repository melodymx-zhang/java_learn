import java.util.Iterator;
import java.util.List;

public class Iteration {
    public static void main(String[] args) {
        // 1. Classic for loop (best when you know the exact number of iterations)
        System.out.println("1. Classic for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Enhanced for-each loop (best for iterating over arrays or collections)
        System.out.println("\n2. Enhanced for-each loop:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 3. while loop (checks condition BEFORE running the loop body)
        System.out.println("\n3. while loop:");
        int count = 3;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }

        // 4. do-while loop (runs the body AT LEAST ONCE, then checks condition)
        System.out.println("\n4. do-while loop:");
        int num = 10;
        do {
            System.out.println("Ran once even though num (" + num + ") >= 5");
            num++;
        } while (num < 5);

        // 5. Loop control: continue (skip current step) and break (exit loop early)
        System.out.println("\n5. break and continue:");
        for (int i = 1; i <= 6; i++) {
            if (i == 3) {
                continue; // Skip 3
            }
            if (i == 5) {
                break;    // Stop the loop at 5
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 6. Iterator & Collection.forEach (modern Java)
        System.out.println("\n6. Iterator and forEach:");
        List<String> languages = List.of("Java", "Python", "C++");

        Iterator<String> it = languages.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        languages.forEach(lang -> System.out.println("Language: " + lang));
    }
}
