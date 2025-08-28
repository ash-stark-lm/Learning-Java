import java.util.*;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter day number (1-7): ");
            int day = sc.nextInt();

            String dayName;
            // old syntax of switch/*
            /*
             * /
             * switch (day) {
             * case 1:
             * dayName = "Monday";
             * break;
             * case 2:
             * dayName = "Tuesday";
             * break;
             * case 3:
             * dayName = "Wednesday";
             * break;
             * case 4:
             * dayName = "Thursday";
             * break;
             * case 5:
             * dayName = "Friday";
             * break;
             * case 6:
             * dayName = "Saturday";
             * break;
             * case 7:
             * dayName = "Sunday";
             * break;
             * default:
             * dayName = "Invalid day";
             * }
             */

            // New syntax of switch (Java 14 and above)
            dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day";
            };
            System.out.println("Day " + day + " is " + dayName);
        }
    }
}
