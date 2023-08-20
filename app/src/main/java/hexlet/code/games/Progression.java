package hexlet.code.games;

import java.util.Scanner;

public class Progression {
    public static void game5() {
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);

        for (int q = 1; q <= 3; q++) {
            int qua = 5 + (int) (Math.random() * 10);
            int step = 2 + (int) (Math.random() * 10);
            int first = 2 + (int) (Math.random() * 50);
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
