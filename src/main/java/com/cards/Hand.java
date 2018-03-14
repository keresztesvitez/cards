package com.cards;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    private int size;

    public Hand(int size) {
        this.size = size;
        this.cards = new ArrayList<>(size);
    }

    public void add(Card card) {
        if (cards.size() <= this.size) {
            cards.add(card);
        } else {
            throw new RuntimeException("Hand size limit ("+this.size+") reached");
        }
    }

    public Card remove(int i) {
        return cards.remove(i);
    }
}
