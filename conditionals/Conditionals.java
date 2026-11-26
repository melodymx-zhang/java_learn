public class Conditionals {
    public static void main(String[] args) {
        // 1. if / else if / else
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // 2. Logical operators: && (AND), || (OR), ! (NOT)
        boolean hasTicket = true;
        int age = 20;
        if (hasTicket && age >= 18) {
            System.out.println("Entry allowed.");
        } else {
            System.out.println("Entry denied.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;
        if (isWeekend || isHoliday) {
            System.out.println("No work today!");
        }

        // 3. Ternary operator (shorthand if-else): condition ? valueIfTrue : valueIfFalse
        int number = 7;
        String parity = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + parity);

        // 4. Classic switch statement (use break to prevent falling through to the next case)
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        // 5. Modern switch expression (Java 14+, no break needed with ->)
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("Day " + day + " is a " + dayType);
    }
}
