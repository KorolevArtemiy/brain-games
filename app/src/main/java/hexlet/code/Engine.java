package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String userName;
    public static int turns() {
        return 3;
    }

    public static Boolean wrong(String ask, String ans) {
        if (ask.equals(ans)) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + ask + "'"
                    + "\nLet's try again, " + userName + "!");
            return true;
        }
    }

    public static void congratulations(int q) {
        if (q == turns()) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static void name() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}

