package hexlet.code;

public class Engine {
    public static int turns() {
        return 3;
    }

    public static Boolean wrong(String ask, String ans) {
        if (ask.equals(ans)) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + ask + "'"
                    + "\nLet's try again, " + Cli.userName + "!");
            return true;
        }
    }

    public static void congratulations(int q) {
        if (q == turns()) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}

