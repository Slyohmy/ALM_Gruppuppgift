import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class guessingGameTest {

    GuessingGame game;


    @Test
    void guessIsTooHigh() {
        game = new GuessingGame(2, 7);
        assertEquals(game.getWrongAnswer(), "The number is less than " + game.getGuess());
    }

    @Test
    void guessIsTooLow() {
        game = new GuessingGame(7, 2);
        assertEquals(game.getWrongAnswer(), "The number is greater than " + game.getGuess());
    }

    @Test
    void outOfGuesses() {
        game = new GuessingGame(1, 2);
        assertFalse(game.isGuessWasCorrect());
    }

    @Test
    void guessIsCorrect() {
        game = new GuessingGame(1, 1);
        assertTrue(game.isGuessWasCorrect());
    }

}
