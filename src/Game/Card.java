/**
 * Class Card specify the attributes of a card.
 *
 * @author Pavel Zemnukhov
 * @version 1.0 08-May-2020
 */

package Game;

public class Card {
    private int suit;
    private int number;

    public Card() {
        this.suit = 0;
        this.number = 0;
    }

    public Card(int newSuite, int newNumber) {
        this.suit = newSuite;
        this.number = newNumber;
    }

    public String displayCard() {
        String cardState = "suit " + this.suit + " number " + this.number;
        return cardState;
    }

    public int getNumber() {
        return this.number;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public void setSuit(int newSuit) {
        this.suit = newSuit;
    }
}

