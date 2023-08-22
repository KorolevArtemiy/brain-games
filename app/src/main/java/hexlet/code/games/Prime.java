package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    public static void game6() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        int randMax = 100;

        for (int q = 1; q <= Engine.turns(); q++) {
            int value = (int) (Math.random() * randMax);
            String ask = "yes";
            if (value < 2) {
                ask = "no";
            }
            for (int i = 2; i < value; i++) {
                if (value % i == 0) {
                    ask = "no";
                    break;
                }
            }
            System.out.println("Question: " + value);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }

            hexlet.code.Engine.congratulations(q);
        }
    }
}
