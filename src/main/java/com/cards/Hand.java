package com.cards;

import com.cards.exceptions.HandException;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    private int maxSize;

    public Hand(int maxSize) {
        this.maxSize = maxSize;
        this.cards = new ArrayList<>(maxSize);
    }

    public void add(Card card) {
        if (cards.size() < this.maxSize) {
            cards.add(card);
        } else {
            throw new HandException("Hand size limit ("+this.maxSize+") reached");
        }
    }

    public Card play(int i) {
        if (cards.size() == 0) {
            throw new HandException("The hand is empty");
        } else if (cards.size() < i) {
            throw new HandException("Index is out of hand's bounds");
        } else {
            return cards.remove(i);
        }
    }
}
