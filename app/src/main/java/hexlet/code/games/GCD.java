package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void game4() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);

        final int randMax = 100;
        final int turns = 3;

        for (int q = 1; q <= turns; q++) {
            int value1 = 1 + (int) (Math.random() * randMax);
            int value2 = 1 + (int) (Math.random() * randMax);
            int minNum = Math.min(value1, value2);
            int maxNum = Math.max(value1, value2);
            int gcd = minNum;

            while (gcd != 0) {
                gcd = maxNum % minNum;
                maxNum = minNum;
                minNum = gcd;
            }

            System.out.println("Question: " + value1 + " " + value2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String ask = String.valueOf(maxNum);

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }

            hexlet.code.Engine.congratulations(q);
        }
    }
}
