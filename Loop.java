import java.util.Scanner;
import java.util.swing;

public class Loop {

    public static void main(String[] args) {
        int num;

        System.out.println("How many times must I shout?");

        // Using Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int count = 1; count <= num; count++) {
            System.out.println("Wake up!");
        }

        // Close the scanner
        scanner.close();
    }
}
