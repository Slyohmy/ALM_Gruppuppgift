import java.util.Scanner;

public class GuessingGame {

    private final Scanner scanner = new Scanner(System.in);
    private final int number;
    private int guess;
    private boolean guessWasCorrect;
    private String wrongAnswer;
    private final String FINAL_RESULT;

    public GuessingGame() {
        welcomeMessage();
        this.number = initializeNumber();
        guessNumber();
        this.FINAL_RESULT = finalResult();
        System.out.println(FINAL_RESULT);
    }

    public GuessingGame(int first, int second) {
        this.number = first;
        this.guess = second;
        evaluate();
        this.FINAL_RESULT = finalResult();
        System.out.println(FINAL_RESULT);
    }

    private int initializeNumber() {
        return 1 + (int)(100 * Math.random());
    }

    private void welcomeMessage() {
        System.out.println("A random number is chosen between 1-100. Pick the right number within 5 attempts!");
    }

    private void guessNumber() {
        for (int i = 0; i < 5; i++) {
            guess = scanner.nextInt();
            evaluate();
            if (guessWasCorrect) {
                break;
            } else {
                System.out.println(wrongAnswer);
                continue;
            }
        }
    }

    private void evaluate() {
        if (guess == number) {
            guessWasCorrect = true;
        } else if (guess > number) {
            wrongAnswer = "The number is less than " +guess;
        } else {
            wrongAnswer = "The number is greater than " + guess;
        }
    }

    private String finalResult() {
        if (guessWasCorrect) {
            return "Congratulations! You guessed my number!";
        } else {
            return "Game over! The number was " + number;
        }
    }

    public int getNumber() {
        return number;
    }

    public int getGuess() {
        return guess;
    }

    public String getWrongAnswer() {
        return wrongAnswer;
    }

    public boolean isGuessWasCorrect() {
        return guessWasCorrect;
    }

    public String getFINAL_RESULT() {
        return FINAL_RESULT;
    }
}
