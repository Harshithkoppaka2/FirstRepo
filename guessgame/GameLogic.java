package guessgame;
import java.util.*;

public class GameLogic extends Game {
    protected boolean playagain = true; 
    protected Scanner s;
    protected int attempts;

    public GameLogic(String Word) {
        super(Word);
        this.s = new Scanner(System.in);
    }

    @Override
    public void PlayGame() {
        while (playagain) {
            attempts = 1; // Reset attempts
            super.PlayGame();
            displayhint(); 

            String guess = "";
            while (!guess.equalsIgnoreCase(Word)) {
                System.out.println("📝 Enter your guess:");
                guess = s.nextLine();

                if (guess.equalsIgnoreCase(Word)) {
                    System.out.println("🎉 Congrats! You guessed the word in " + attempts + " attempts!");
                } else {
                    System.out.println("❌ Incorrect. Try again!");
                    System.out.println("🔍 Revealed so far: " + getWordarray());
                    attempts++;
                }
            }

            System.out.println("📊 Total attempts: " + attempts);

            // Ask if the player wants to play again
            System.out.println("🔄 Do you want to play again? (yes/no)");
            String choice = s.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                Word = Cars[new Random().nextInt(Cars.length)]; // Pick new word
                Wordarray = new char[Word.length()]; // Reset array
                Arrays.fill(Wordarray, '-'); 
            } else {
                playagain = false; 
                System.out.println("👋 Thanks for playing!");
            }
        }

        s.close(); // Close scanner at the end
    }

    public static void main(String[] args) {
        Random r = new Random();
        String Word = Cars[r.nextInt(Cars.length)];

        GameLogic g1 = new GameLogic(Word);
        g1.PlayGame();
    }
}
