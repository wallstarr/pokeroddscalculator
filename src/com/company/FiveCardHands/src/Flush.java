package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.*;

public class Flush extends FiveCardHand {

    public static boolean matches(Card[] fiveCardHand) {
        Suit suitToTrack = fiveCardHand[0].getSuit();
        for (int i = 1; i < NUM_OF_CARDS; i++) {
            Suit currentCardSuit = fiveCardHand[i].getSuit();
            if (currentCardSuit != suitToTrack) {
                return false;
            }
        }
        return true;
    }
}
