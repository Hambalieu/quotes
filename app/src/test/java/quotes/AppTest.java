/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasValidPrintLine() {
        try{
            Gson gson = new Gson();
            String userPath = System.getProperty("user.dir");
            File recentquotesJsonFile = new File(userPath + "/src/test/resources/recentquotes.json");
            FileReader recentquotesJsonFileReader = new FileReader(recentquotesJsonFile);
            List<Quote> quotesList = new Gson().fromJson(recentquotesJsonFileReader, new TypeToken<List<Quote>>() {}.getType());
            recentquotesJsonFileReader.close();
            Quote chosenQuote = quotesList.get(0);

            String stringBuilder = "Author: " + chosenQuote.author + "\nQuote: " + chosenQuote.text;
            assert(stringBuilder.equals("Author: Marilyn Monroe\n" +
                    "Quote: I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love."));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test void appThrowException() {
        boolean didCatch = false;
        try{
            Gson gson = new Gson();
            String userPath = System.getProperty("user.dir");
            File recentquotesJsonFile = new File(userPath + "/src/test/resourcess/recentquotes.json");
            FileReader recentquotesJsonFileReader = new FileReader(recentquotesJsonFile);
            List<Quote> quotesList = new Gson().fromJson(recentquotesJsonFileReader, new TypeToken<List<Quote>>() {}.getType());
            recentquotesJsonFileReader.close();
            Quote chosenQuote = quotesList.get(0);

            String stringBuilder = "Author: " + chosenQuote.author + "\nQuote: " + chosenQuote.text;
            assert(stringBuilder.equals("Author: Marilyn Monroe\n" +
                    "Quote: I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love."));

        } catch (IOException e) {
            didCatch = true;
            e.printStackTrace();
        }
        assertTrue(didCatch);

    }
}