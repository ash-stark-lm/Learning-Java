import java.util.*;

public class Main {

    public static void main(String[] args) {
        // List of items of same type-> array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // accessing elements
        System.out.println(numbers[0]); // prints 1
        System.out.println(numbers[2]); // prints 3

        // modifying elements
        numbers[4] = 10; // changes last element from 5 to 10
        System.out.println(numbers[4]); // prints 10

        // length of array
        System.out.println("Length of array: " + numbers.length);

        // iterating using for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // enhanced for loop
        System.out.println("Array elements (using enhanced for loop):");
        for (int num : numbers) {
            System.out.println(num);
        }

        // ✅ try-with-resources for Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // user input for marks
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int[] marks = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter mark " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            System.out.println("Marks are: ");
            for (int mark : marks) {
                System.out.println(mark);
            }

            // linear search
            System.out.print("Enter size of array for searching: ");
            int size2 = sc.nextInt();
            int[] arr = new int[size2];
            for (int i = 0; i < size2; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter key to search: ");
            int key = sc.nextInt();
            linearSearch(arr, key);
        }
    }

    public static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }
        System.out.println("Key not found");
    }
}
