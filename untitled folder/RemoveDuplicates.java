import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use LinkedHashSet to maintain insertion order and uniqueness
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            set.add(ch); // Only keeps the first occurrence
        }

        // Build result string
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        // Output result
        System.out.println("Modified string (duplicates removed): " + result.toString());

        scanner.close();
    }
}
