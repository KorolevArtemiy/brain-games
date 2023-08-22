package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static void game3() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        char[] chArray = new char[]{'+', '-', '*'};

        final int randMax = 100;
        final int turns = 3;

        for (int q = 1; q <= turns; q++) {
            int value1 = (int) (Math.random() * randMax);
            int value2 = (int) (Math.random() * randMax);
            int index = (int) Math.floor(Math.random() * chArray.length);

            String ask = switch (index) {
                case 0 -> String.valueOf(value1 + value2);
                case 1 -> String.valueOf(value1 - value2);
                case 2 -> String.valueOf(value1 * value2);
                default -> null;
            };

            System.out.println("Question: " + value1 + " " + chArray[index] + " " + value2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }

            hexlet.code.Engine.congratulations(q);

        }
    }
}
