package com.cards;

public enum Suit {
    CLUBS(Color.BLACK), DIAMONDS(Color.RED), HEARTS(Color.RED), SPADES(Color.BLACK);

    private final Color color;

    Suit(final Color color) {
        this.color = color;
    }

    public enum Color {
        BLACK,
        RED
    }

    public Color getColor() {
        return color;
    }

    public String toSymbol() {
        StringBuilder symbol = new StringBuilder();
        symbol.append("");
        switch (this) {
            case CLUBS:
                symbol.append('\u2663');
                break;
            case DIAMONDS:
                symbol.append('\u2666');
                break;
            case HEARTS:
//                symbol.append('\u2665');
                symbol.append('♥');
                break;
            case SPADES:
                symbol.append('\u2660');
                break;
        }
        return symbol.toString();
    }

    @Override
    public String toString() {
        switch (this) {
            case CLUBS:
                return "Club";
            case DIAMONDS:
                return "Diamond";
            case HEARTS:
                return "Heart";
            case SPADES:
                return "Spade";
            default:
                return super.toString();
        }
    }
}
