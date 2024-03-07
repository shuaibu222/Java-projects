/*
 * Enums in Java are a special data type that allows for a variable to be a set of predefined constants. 
 * They provide a way to define collections of constants, making code more readable and maintainable.
 */
enum Day {
    // Define constants for days of the week
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enums {
    public static void main(String[] args) {
        // Using enums in Java
        Day today = Day.MONDAY;

        // Switch-case statement with enums
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}
