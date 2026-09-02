
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String UserName01 = "alex";
        String Password01 = "sunshine";
        String UserName02 = "emma";
        String Password02 = "haskell";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if ((username.equals(UserName01) && password.equals(Password01))) {
            System.out.println("You have successfully logged in!");
        } else if ((username.equals(UserName02) && password.equals(Password02))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
