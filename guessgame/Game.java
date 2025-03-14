package guessgame;

import java.util.Arrays;

public class Game {
    
    protected String Word; // Removed static
    protected char[] Wordarray; 
    protected static String[] Cars = {"mustang","camaro","challenger","charger"};

    public Game(String Word) {
        this.Word = Word;
        this.Wordarray = new char[Word.length()];
        Arrays.fill(Wordarray, '-'); // Initialize Wordarray with '-'
        System.out.println("🔍 Word to guess: " + Arrays.toString(Wordarray));
    }

    void displayhint() {
        System.out.println("💡 This is a " + Word.length() + "-letter word.");
    }

    void PlayGame() {
        System.out.println("🎮 The game is starting...");
        System.out.println("⌛ Please hold on...");
    }

    public String getWordarray() {
        return new String(Wordarray);
    }

    void displayword() {
        System.out.println("🔤 The word to be guessed is: " + Word);
    }
}
