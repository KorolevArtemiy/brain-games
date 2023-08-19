package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);

        int userChoice = scanner.nextInt();
        if (1 < userChoice && userChoice < 7) {
            Cli.name();
        }
        switch (userChoice) {
            case 1 -> System.out.println("Welcome to the Brain Games!");
            case 2 -> Even.game2();
            case 3 -> Calc.game3();
            case 4 -> GCD.game4();
            case 5 -> Progression.game5();
            case 6 -> Prime.game6();
            default -> {
            }
        }
    }
}
