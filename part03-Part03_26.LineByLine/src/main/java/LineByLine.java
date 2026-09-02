
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String[] line01 = line1.split(" ");
        String[] line02 = line2.split(" ");
        for (int i = 0; i < line01.length; i++) {
            System.out.println(line01[i]);
        }
        for (int i = 0; i < line02.length; i++) {
            System.out.println(line02[i]);
        }
    }
}
