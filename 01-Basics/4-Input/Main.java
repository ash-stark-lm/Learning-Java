import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {// so that no need to close sc manually

            // Input
            System.out.print("Enter name: ");
            String name = sc.next(); // one single word
            System.out.println("Name: " + name);

            sc.nextLine(); // consume the leftover newline

            System.out.print("Enter full name: ");
            String fullName = sc.nextLine(); // entire line including spaces
            System.out.println("Full Name: " + fullName);

            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Age: " + age);

            System.out.print("Enter marks: ");
            float marks = sc.nextFloat();
            System.out.println("Marks: " + marks);

        }
    }
}
