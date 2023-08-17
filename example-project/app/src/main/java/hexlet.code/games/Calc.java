package hexlet.code.games;
import java.util.Scanner;

public class Calc {
    public static void game3() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        char[] chArray = new char[]{'+', '-', '*'};

        for (int q = 1; q <= 3; q++) {
            int value1 = (int) (Math.random() * 20);
            int value2 = (int) (Math.random() * 20);
            int index = (int) Math.floor(Math.random() * chArray.length);

            String ask = switch (index) {
                case 0 -> String.valueOf(value1 + value2);
                case 1 -> String.valueOf(value1 - value2);
                case 2 -> String.valueOf(value1 * value2);
                default -> null;
            };

            System.out.println("Question " + q + ": " + value1 + " " + chArray[index] + " " + value2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }
        }
    }
}
