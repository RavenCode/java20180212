package com.xyzcorp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuitTest {
    @Test
    public void testBasicEnum() {
        Suit trumpSuit = Suit.HEARTS;
        assertEquals(Suit.HEARTS, trumpSuit);
    }

    @Test
    public void testTrumpSuit() {
        Suit suit = Suit.HEARTS;
        assertEquals(false, suit.isTrumpSuit());

        suit = Suit.SPADES;
        assertEquals(true, suit.isTrumpSuit());
    }

    @Test
    public void testListValues() {
        StringBuilder sb = new StringBuilder();

        for (Suit s : Suit.values()) {
            sb.append(s);
            if (s.isTrumpSuit()) {
                sb.append(" (trump suit)");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
