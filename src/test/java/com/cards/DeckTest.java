package com.cards;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DeckTest {

    private static final int DEFAULT_DECK_SIZE = 52;

    @Test
    public void testDefaultDeck() {
        Deck deck = new Deck();

        assertThat(deck.getSize(), is(DEFAULT_DECK_SIZE));
        Card card = deck.draw();
        assertThat(card.getRank(), is(Rank.TWO));
        assertThat(card.getSuit(), is(Suit.CLUBS));
    }

}