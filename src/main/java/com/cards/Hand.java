package com.cards;

import com.cards.exceptions.HandException;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    private int size;

    public Hand(int size) {
        this.size = size;
        this.cards = new ArrayList<>(size);
    }

    public void add(Card card) {
        if (cards.size() < this.size) {
            cards.add(card);
        } else {
            throw new HandException("Hand size limit ("+this.size+") reached");
        }
    }

    public Card remove(int i) {
        if (cards.size() > 0) {
            return cards.remove(i);
        } else {
            throw new HandException("The hand is empty");
        }
    }
}
