package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void game2() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        String ask;

        for (int q = 1; q <= 3; q++) {
            int value = (int) (Math.random() * 100);

            if (value % 2 == 0) {
                ask = "yes";
            } else {
                ask = "no";
            }

            System.out.println("Question " + q + ": " + value);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }
        }
    }
}

