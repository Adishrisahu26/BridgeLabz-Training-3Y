import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // StringBuilder to store result
        StringBuilder toggled = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));  // Upper → lower
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));  // Lower → upper
            } else {
                toggled.append(ch); // Keep non-alphabetic characters unchanged
            }
        }

        // Output result
        System.out.println("Toggled string: " + toggled.toString());

        scanner.close();
    }
}
