import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        playGame();
    }

    static void playGame() {
        int MagicNum = (int) (Math.random() * 10) + 1;
        System.out.println("You have 3 chances to guess the magic number between 1 and 10.");

        Scanner sc = new Scanner(System.in);
        boolean guessCorrect = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("Guess the magic number!");
            int guess = sc.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.println("Number must be between 1 and 10.");
                i--;
                continue;
            }

            if (MagicNum == guess) {
                System.out.println("Congratulations! You guessed it!");
                guessCorrect = true;
                break;
            } else if (guess < MagicNum) {
                System.out.println("Your number is too low!");
            } else {
                System.out.println("Your number is too high!");
            }
        }

        if (!guessCorrect) {
            System.out.println("You have used all your guesses. The magic number was: " + MagicNum);
        }

        System.out.println("Would you like to play again? Enter Y or N:");
        sc.nextLine();
        char playAgain = sc.nextLine().trim().charAt(0);

        if (playAgain == 'Y' || playAgain == 'y') {
            playGame();
        } else {
            System.out.println("Thank you for playing!");
        }

        sc.close();
    }
}
