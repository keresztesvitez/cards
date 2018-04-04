package com.cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private static final int DEFAULT_DECK_SIZE = 52;
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = generateDeck();
    }

    private ArrayList<Card> generateDeck() {
        ArrayList<Card> cards = new ArrayList<>(DEFAULT_DECK_SIZE);

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }

        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        //draw the top card from the deck
        if (cards.size() > 0) {
            return cards.remove(0);
        } else {
            throw new IllegalStateException("Deck is empty");
        }

    }

    public int getSize() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Deck " + cards.toString();
    }
}
