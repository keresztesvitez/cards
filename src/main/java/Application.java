import com.cards.Deck;
import com.cards.InputHandler;

public class Application {

    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println(deck);

        deck.shuffle();
        System.out.println(deck);

        System.out.println(deck.draw());
        InputHandler.readInput();

    }
}
