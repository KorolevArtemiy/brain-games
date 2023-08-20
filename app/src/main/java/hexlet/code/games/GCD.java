package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    public static void game4() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);

        for (int q = 1; q <= 3; q++) {
            int value1 = 1 + (int) (Math.random() * 100);
            int value2 = 1 + (int) (Math.random() * 100);
            int min = Math.min(value1, value2);
            int max = Math.max(value1, value2);
            int gcd = min;

            while (gcd != 0) {
                gcd = max % min;
                max = min;
                min = gcd;
            }

            System.out.println("Question: " + value1 + " " + value2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String ask = String.valueOf(max);

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }

            hexlet.code.Engine.congratulations(q);
        }
    }
}
