
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = -1;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            sum += number;
            count++;
            if (number == 0) {
                break;
            }
        }
        System.out.println("Average of the numbers: " + ((double) sum / count));
    }
}
