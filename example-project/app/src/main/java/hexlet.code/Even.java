package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int q = 1; q <= 3; q++) {
            double num = Math.random() * 100;
            System.out.println("Question " + q + ": " + num);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
        }
    }
}
