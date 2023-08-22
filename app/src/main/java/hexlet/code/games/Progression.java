package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void game5() {
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);

        final int quaMaxRand = 10;
        final int quaMinRand = 5;
        final int stepMaxRand = 10;
        final int stepMinRand = 2;
        final int firstMaxRand = 50;
        final int firstMinRand = 2;
        final int turns = 3;

        for (int q = 1; q <= turns; q++) {
            int qua = quaMinRand + (int) (Math.random() * quaMaxRand);
            int step = stepMinRand + (int) (Math.random() * stepMaxRand);
            int first = firstMinRand + (int) (Math.random() * firstMaxRand);
            int skip = (int) (Math.random() * qua) * step + first;
            int max = qua * step + first;
            String ask = String.valueOf(skip);
            System.out.print("Question: ");

            for (int j = first; j <= max; j += step) {
                if (j == skip) {
                    System.out.print(".. ");
                } else {
                    System.out.print(j + " ");
                }
            }

            System.out.print("\nYour answer: ");
            String userAnswer = scanner.next();

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }

            hexlet.code.Engine.congratulations(q);
        }
    }
}
