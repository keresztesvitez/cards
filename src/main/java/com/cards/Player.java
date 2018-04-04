package com.cards;

public class Player {

    private String name;
    private Hand hand;
    private int score;


    public Player(String name, Hand hand, int score) {
        this.name = name;
        this.hand = hand;
        this.score = score;
    }

    public Hand getHand() {
        return hand;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", score=" + score +
                '}';
    }
}
