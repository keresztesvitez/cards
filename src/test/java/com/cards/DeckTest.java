package com.cards;


import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;

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

    @Test(expected = IllegalStateException.class)
    public void drawShouldThrowException_whenDeckIsEmpty() {
        Deck deck = new Deck();
        while (true) {
            deck.draw();
        }
    }

    @Test
    public void testDeckShuffle() {
        Deck deck = new Deck();

        String deckHash = DigestUtils.md5Hex(deck.toString()).toUpperCase();

        deck.shuffle();

        String shuffledHash = DigestUtils.md5Hex(deck.toString()).toUpperCase();

        assertFalse(shuffledHash.equals(deckHash));
    }


}