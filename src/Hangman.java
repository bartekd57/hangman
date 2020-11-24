import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    Scanner scan = new Scanner(System.in);
    WordsDatabase wd = new WordsDatabase();
    int mises = 0;

    public  String[] wordToArray(String word) {
        String[] splittedWord = word.split("");
        return splittedWord;
    }

    public void printOptions() {
        System.out.println("nacisnij 1, zeby zaczac zgadywanie");
        System.out.println("nacisnij 0, zeby wyjsc z programu");
    }

    public void printWord(String []  wordInStars) {
        System.out.println("hasło do zgadnięcia");
        System.out.println(Arrays.toString(wordInStars));
    }
    public String getLetter(){
        System.out.println("podaj litere");
        String letter = scan.nextLine();
        return letter;
    }

    public void wordChecker(String [] wordSplitted,String[] wordInStars, String letter){

        for (int i = 0; i < wordInStars.length; i++) {
            if(letter.equals(wordSplitted[i]))
            wordInStars[i] = letter;
        }

    }


}
