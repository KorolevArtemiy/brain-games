package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void game2() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        final int randMax = 100;
        final int turns = 3;

        for (int q = 1; q <= turns; q++) {
            int value = (int) (Math.random() * randMax);

            String ask = "no";
            if (value % 2 == 0) {
                ask = "yes";
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

