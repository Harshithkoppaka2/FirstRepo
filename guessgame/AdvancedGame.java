package guessgame;
import java.util.*;

public class AdvancedGame extends GameLogic {
    static Random r = new Random();

    public AdvancedGame(String Word) {
        super(Word);
    }

    @Override
    public void PlayGame() {
        while (playagain) {
            attempts = 1; 

            super.PlayGame();
            displayhint(); 

            String guess = "";
            while (!guess.equalsIgnoreCase(Word)) {
                System.out.println("📝 Enter your guess:");
                guess = s.nextLine();

                if (guess.equalsIgnoreCase(Word)) {
                    System.out.println("🎉 Congrats! You guessed the word in " + attempts + " attempts!");
                    break;
                } else {
                    System.out.println("❌ Try again...");
                    revealRandomLetter(); // Reveal a letter after incorrect guess
                    displayhint();
                    attempts++;
                }
            }

            System.out.println("📊 Number of attempts: " + attempts);

            System.out.println("🔄 Do you want to play again? (yes/no)");
            String choice = s.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                Word = Cars[r.nextInt(Cars.length)];
                Wordarray = new char[Word.length()]; // Reset word array properly
                Arrays.fill(Wordarray, '-'); 
            } else {
                playagain = false;
                System.out.println("👋 Thanks for playing!");
            }
        }

        s.close(); // Close scanner at the end
    }

    @Override
    public void displayhint() {
        super.displayhint();
        System.out.println("🔍 Revealed so far: " + getWordarray());
    }

    private void revealRandomLetter() {
        int index;
        do {
            index = r.nextInt(Word.length());
        } while (Wordarray[index] != '-'); // Ensure we reveal an unrevealed letter
        Wordarray[index] = Word.charAt(index);
    }

    public static void main(String[] args) {
        String Word = Cars[r.nextInt(Cars.length)];
        AdvancedGame g3 = new AdvancedGame(Word);
        g3.PlayGame();
    }
}
