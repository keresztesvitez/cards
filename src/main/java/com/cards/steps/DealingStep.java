package com.cards.steps;

import com.cards.Player;

import java.util.List;

public class DealingStep implements GameStep {

    private List<Player> players;

    public DealingStep(List<Player> players) {
        this.players = players;
    }

    @Override
    public void play() {
        //Create a deck

        //shuffle it

        //deal all the cards to 4 players
    }
}
