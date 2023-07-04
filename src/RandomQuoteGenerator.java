import java.util.Random;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        String[] quotes = {
                "The best way to predict the future is to create it.",
                "Innovation distinguishes between a leader and a follower.",
                "Your time is limited, don't waste it living someone else's life.",
                "The only way to do great work is to love what you do.",
                "Stay hungry, stay foolish."
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);
        String randomQuote = quotes[index];

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("Random Quote of the Day:");
        System.out.println(randomQuote);
        System.out.println("----------------------------------------------------------------");
    }
}
