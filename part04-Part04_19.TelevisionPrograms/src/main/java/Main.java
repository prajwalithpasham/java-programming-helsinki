import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println("Maximum duration: ");
        int MaxD = scanner.nextInt();


        for (TelevisionProgram program : programs) {
            if(program.getDuration() <= MaxD) {
                System.out.println(program);
            }
        }
    }
}
