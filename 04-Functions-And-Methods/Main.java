
import java.util.Scanner;

public class Main {
    public static void printName(String name) {
        if (name == null || name.length() == 0) {
            System.out.println("Name is empty");
            return; // early return
        }
        System.out.println(name);

    }

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // function declaration
        /*
         * returnType functionName(parameter1, parameter2,...){
         * // function body
         * return value;
         * }
         */

        // e.g print a given name in a function

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            printName(name);

            System.out.print("Enter value of a: ");
            int a = sc.nextInt();
            System.out.print("Enter value of b: ");
            int b = sc.nextInt();

            int sum = addTwoNumbers(a, b);
            System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        }

    }

    // we can pass by value and pass by reference also
}
