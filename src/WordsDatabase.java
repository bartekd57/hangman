import java.util.Random;

public class WordsDatabase {

    String [] words = {"samochód", "karawan", "lala", "psik"};


    public String getYourWord(){
        Random random = new Random();
        int i = random.nextInt(words.length);
        return words[i];
    }

}
