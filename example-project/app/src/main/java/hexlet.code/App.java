package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        int num = Integer.parseInt(userChoice);
        if ((0 < num) && (num < 7)) {
            System.out.println("Welcome to the Brain Games!");
            Cli.name();
            /*switch (num) {
                case 2:
                    Even.even();
                    break;
            }*/
        }
    }
}
