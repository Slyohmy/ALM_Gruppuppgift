import java.util.Scanner;

public class Game {

    public static final Scanner scanner = new Scanner(System.in);
    public static final int number = 1 + (int)(100 * Math.random());
    public static final int attempts = 5;
    public static int i, guess;

    public static final String MSG_TOO_HIGH = "The number is less than ";
    public static final String MSG_TOO_LOW = "The number is greater than ";
    public static final String MSG_GAMEOVER = "Game over! The number was ";
    public static final String MSG_WIN = "Congratulations! You guessed my number!";

    //starts the game here
    public static void guessingNumberGame() {
        System.out.println("A random number is chosen between 1-100. Pick the right number within 5 attempts!");

        for (i = 0; i < attempts; i++) {

            System.out.println("Guess the number:");

            guess = scanner.nextInt();

            if (number == guess) {
                System.out.println(MSG_WIN);
                break;
            }

            else if (number > guess && i != attempts - 1) {
                System.out.println(MSG_TOO_LOW + guess);
            }

            else if (number < guess && i != attempts - 1) {
                System.out.println(MSG_TOO_HIGH + guess);
            }
        }

        if (i == attempts) {
            System.out.println(MSG_GAMEOVER + number);
        }
    }

    public static void main(String arg[]) {
        guessingNumberGame();
    }
}
