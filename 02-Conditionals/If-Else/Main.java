import java.util.*;

public class Main {
    // just like int main() in c++ here main is the entrypoint of java
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You are an adult.");
            } else if (age >= 13) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are a minor.");
            }

            // call the second function here
            System.out.println("Enter the number to check even or odd:");
            int number = sc.nextInt();
            checkEven(number);

            // we can also pass scanner object to other functions
            // and take input there also
            compare(sc);
        }
    }

    // Pass the same scanner so user doesn’t need to input twice
    public static void checkEven(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    public static void compare(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }

    }
}
