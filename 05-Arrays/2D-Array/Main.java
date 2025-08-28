
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows:");
            int row = sc.nextInt();
            System.out.println("Enter number of columns: ");
            int col = sc.nextInt();

            int[][] table = new int[row][col];
            // input in 2D array
            System.out.println("Enter the elements of the table: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    table[i][j] = sc.nextInt();
                }
            }

            // output in 2D array
            System.out.println("The elements in the table are: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
