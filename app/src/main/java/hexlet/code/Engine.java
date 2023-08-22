package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    public static String getUserName() {
        return userName;
    }
    public static void setUserName(String name) {
        userName = name;
    }
    public static void name() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        Engine.setUserName(scanner.next());
        System.out.println("Hello, " + Engine.getUserName() + "!");
    }

    public static Boolean wrong(String ask, String ans) {
        if (ask.equals(ans)) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + ask + "'"
                    + "\nLet's try again, " + Engine.getUserName() + "!");
            return true;
        }
    }

    public static void congratulations(int q) {
        final int turn = 3;
        if (q == turn) {
            System.out.println("Congratulations, " + Engine.getUserName() + "!");
        }
    }
}
