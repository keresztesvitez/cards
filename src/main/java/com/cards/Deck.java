package com.cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = generateDeck();
    }

    private ArrayList<Card> generateDeck() {
        ArrayList<Card> cards = new ArrayList<>(52);

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
        //remove the top card from the deck
        if (cards.size() > 0) {
            return cards.remove(0);
        } else {
            throw new IllegalStateException("Deck is empty");
        }

    }

    @Override
    public String toString() {
        return "Deck " + cards.toString();
    }
}
