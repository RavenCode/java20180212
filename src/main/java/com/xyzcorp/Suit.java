package com.xyzcorp;

public enum Suit {
    HEARTS, CLUBS, SPADES(true), DIAMONDS;

    private boolean isTrumpSuit;

    Suit() {
        this(false);
    }

    Suit(boolean trumpSuit) {
        this.isTrumpSuit = trumpSuit;
    }

    public boolean isTrumpSuit() {
        return isTrumpSuit;
    }
}
