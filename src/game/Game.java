/*import java.util.Scanner;

public class Game {

    public  final Scanner scanner = new Scanner(System.in);

    public  int number = 1 + (int)(100 * Math.random());
    public  final int attempts = 5;
    public  int i;




    public  int guess;

    public  final String MSG_TOO_HIGH = "The number is less than ";
    public  final String MSG_TOO_LOW = "The number is greater than ";
    public  final String MSG_GAMEOVER = "Game over! The number was ";
    public  final String MSG_WIN = "Congratulations! You guessed my number!";



    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }

    public  String MSG ="";

    //starts the game here.
    public  void guessingNumberGame() {

    //Start game over here
    public static void guessingNumberGame() {

        System.out.println("A random number is chosen between 1-100. Pick the right number within 5 attempts!");

        for (i = 0; i < attempts; i++) {

            System.out.println("Guess the number:");

            guess = scanner.nextInt();

            if (number == guess) {
                setMSG(MSG_WIN);
                System.out.println(MSG);
                break;
            }

            else if (number > guess && i != attempts - 1) {
                setMSG(MSG_TOO_LOW);
                System.out.println(MSG + guess);
            }

            else if (number < guess && i != attempts - 1) {
                setMSG(MSG_TOO_HIGH);
                System.out.println(MSG + guess);
            }
        }

        if (i == attempts) {
            System.out.println(MSG_GAMEOVER + number);
        }
    }


 */


