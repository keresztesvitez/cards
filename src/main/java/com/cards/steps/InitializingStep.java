package com.cards.steps;

import com.cards.Player;

import java.util.List;

public class InitializingStep implements GameStep {

    private List<Player> players;

    public InitializingStep(List<Player> players) {
        this.players = players;
    }

    @Override
    public void play() {
        //create players according to game rules
    }
}
