package hamza.leet.TwoSum;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        // Read the number of elements to be stored in the array
        int n = scanner.nextInt();
        // Declare an array to store the numbers
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        // Loop to read each number into the array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        // Enter your target
        System.out.println("Enter your target: ");
        int target = scanner.nextInt();








        scanner.close(); // Close the scanner to prevent resource leak
    }
}