package hexlet.code.games;

import java.util.Scanner;

public class Progression {
    public static void game5() {
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);

        for (int q = 1; q <= 3; q++) {
            int qua = 5 + (int) (Math.random() * 10);
            int step = 2 + (int) (Math.random() * 10);
            int skip = (int) (Math.random() * qua);
            int first = 2 + (int) (Math.random() * 50);
            String ask = "";

            System.out.print("Question " + q + ": ");

            for (int j = first; j <= first + qua * step; j += step) {
                if (j == first + skip * step) {
                    System.out.print(".. ");
                    ask = String.valueOf(j);
                } else {
                    System.out.print(j + " ");
                }
            }

            System.out.print("\nYour answer: ");
            String userAnswer = scanner.next();

            if (hexlet.code.Engine.wrong(ask, userAnswer)) {
                break;
            }
        }
    }
}
