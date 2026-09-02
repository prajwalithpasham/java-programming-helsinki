
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = "0";

        while(true){

            number = scanner.nextLine();

            if (number.equals("end")) {
                break;
            }

            System.out.println(Integer.valueOf(number) * Integer.valueOf(number) * Integer.valueOf(number));
        }
        
    }
}
