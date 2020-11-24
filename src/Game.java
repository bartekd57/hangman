import java.util.Arrays;
import java.util.Scanner;

public class Game {
    Hangman h = new Hangman();
    int misses = 0;
    WordsDatabase wd = new WordsDatabase();

    Scanner scan = new Scanner(System.in);

    public void mainLoop() {
        String yourWord = wd.getYourWord();
        h.printOptions();
        int option = scan.nextInt();
        String[] wordSplitted = h.wordToArray(yourWord);
        String[] wordInStars = new String[wordSplitted.length];
        Arrays.fill(wordInStars, "*");

        if (option == 0) {
            return;
        } else if (option == 1) {
            while (Arrays.equals(wordSplitted, wordInStars) == false) {
                h.printWord(wordInStars);
                String letter = h.getLetter();
                h.wordChecker(wordSplitted, wordInStars, letter);
            }
            System.out.println("brawo, zgadłeś, hasło to: ");
            for (String wordInStar : wordInStars) {
                System.out.print(wordInStar);
            }
        }

    }


}
