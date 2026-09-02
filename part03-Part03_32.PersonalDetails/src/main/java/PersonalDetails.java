
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);

            // longest name check
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            // average calculation
            sum += year;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
