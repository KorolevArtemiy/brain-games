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

        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        int userChoice = scanner.nextInt();
        if (0 < userChoice && userChoice <= prime) {
            Engine.name();
        }
        switch (userChoice) {
            case even -> Even.game2();
            case calc -> Calc.game3();
            case gcd -> GCD.game4();
            case progression -> Progression.game5();
            case prime -> Prime.game6();
            default -> {
            }
        }
    }
}
