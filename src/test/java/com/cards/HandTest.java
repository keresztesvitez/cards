package com.cards;

import com.cards.exceptions.HandException;
import org.junit.Test;

public class HandTest {

    @Test(expected = HandException.class)
    public void addCardShouldThrowException_whenHandSizeLimitReached() {
        Deck deck = new Deck();

        Hand hand = new Hand(1);

        hand.add(deck.draw());
        hand.add(deck.draw());
    }

    @Test(expected = HandException.class)
    public void removeCardShouldThrowException_whenHandIsEmpty() {
        Deck deck = new Deck();

        Hand hand = new Hand(1);

        hand.add(deck.draw());

        hand.remove(0);
        hand.remove(0);
    }
}