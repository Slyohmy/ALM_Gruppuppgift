import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTesting {

    Game game = new Game();








    @Test
    public void testTooHigh() {



       game.setGuess(30);
       game.setNumber(40);
       game.setMSG(game.MSG_TOO_LOW);





        assertEquals(game.getMSG() + game.getGuess(), "The number is greater than " + game.getGuess());
    }


    @Test
    public void testTooLow() {
    game.setGuess(99);
    game.setNumber(50);
    game.setMSG(game.MSG_TOO_HIGH);
        assertEquals(game.getMSG() + game.getGuess(), "The number is less than " + game.getGuess());
    }

   @Test
    public void testWin() {
        game.setGuess(69);
        game.setNumber(69);
        game.setMSG(game.MSG_WIN);
        assertEquals(game.getMSG(), "Congratulations! You guessed my number!");
        assertEquals(game.getGuess(), game.getNumber());

    }


}



