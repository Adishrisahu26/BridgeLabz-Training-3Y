import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Input substring
        System.out.print("Enter the substring to search: ");
        String subString = scanner.nextLine();

        int count = 0;
        int index = 0;

        // Search for substring occurrences
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index = index + subString.length();  // Move past the last found index
        }

        // Output result
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times in the string.");

        scanner.close();
    }
}
