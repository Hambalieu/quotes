package quotes;

public class QuoteApi {
    String quoteText;
    String quoteAuthor;

    @Override
    public String toString() {
        return "QuoteApi{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                '}';
    }
}
