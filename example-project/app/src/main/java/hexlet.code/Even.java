package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (int q = 1; q <= 3; q++) {
            double num = Math.random() * 100;
            int value = (int) num;

            System.out.println("Question " + q + ": " + value);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next();

            if (((value % 2 == 0) && (userAnswer.equals("yes"))) || ((value % 2 != 0) && (userAnswer.equals("no")))) {
                System.out.println("Correct!");
            } else {
                if (userAnswer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'"
                            + "\nLet's try again, " + Cli.userName + "!");
                    break;
                }
                if (userAnswer.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'"
                            + "\nLet's try again, " + Cli.userName + "!");
                    break;

                }
            }
        }
    }
}

